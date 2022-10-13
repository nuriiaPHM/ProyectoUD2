package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import com.example.proyectoud1.model.Film;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Class that extrends of Controler
 */
public class FilmController extends Controller implements Initializable {


    private String filmURL = "https://ghibliapi.herokuapp.com/films?title=";
    private String results = "No data to save";
    @FXML
    private TextField filmTitle;
    @FXML
    private Button filmSearch;
    @FXML
    public TableView filmTable;
    @FXML
    public TableColumn colTitle;
    @FXML
    private TableColumn oTitle;
    @FXML
    private TableColumn rTitle;
    @FXML
    private TableColumn year;
    @FXML
    private ImageView image;
    @FXML
    public Button btnFilmsGoBack;
    @FXML
    public Button btnSaveTable;
    @FXML
    public Button btnSaveFilm;
    @FXML
    public TextField txtSaveFilm;

    private ObservableList<Film> tableFilms;

    /**
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableFilms = FXCollections.observableArrayList();
        this.colTitle.setCellValueFactory(new PropertyValueFactory("title"));
        this.oTitle.setCellValueFactory(new PropertyValueFactory("originalTitle"));
        this.rTitle.setCellValueFactory(new PropertyValueFactory("originalTitleRomanised"));
        this.year.setCellValueFactory(new PropertyValueFactory("releaseDate"));

    }

    /**
     * To search the title in the API
     * @param actionEvent The click in the button 'filmSearch'
     */
    @FXML
    public void searchFilm(ActionEvent actionEvent) {
        try {
            if(!filmTitle.getText().isEmpty()) {
                String cadena = "";
                for (int i = 0; i < filmTitle.getText().length(); i++) {
                    if (filmTitle.getText().charAt(i) == ' ') {
                        cadena += "%20";
                    } else {
                        cadena += filmTitle.getText().charAt(i);
                    }
                }
                URL jsonURL = new URL(filmURL + cadena);

                ObjectMapper objectMapper = new ObjectMapper();
                List<Film> films = objectMapper.readValue(jsonURL, new TypeReference<List<Film>>() {
                });

                Film film = films.get(0);

                tableFilms.add(film);
                this.filmTable.setItems(tableFilms);

                Image banner = new Image(film.getMovieBanner(), true);
                image.setImage(banner);
            }else{
                filmTitle.setText("Introducir nombre");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * To open again the Main Window
     * @param actionEvent The click in the button 'btnFilmsGoBack'
     */
    public void goBack(ActionEvent actionEvent){
        try {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("main.fxml"));

            MainController mainController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.setTitle("Studio Ghibli");
            stage.show();

            Stage myStage = (Stage) this.btnFilmsGoBack.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * To save the Films that the user has searched
     * @param actionEvent The click in the button 'btnSaveTable'
     */
    public void saveResulst(ActionEvent actionEvent) {

        try {
            results = getResults();

            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("save.fxml"));
            //SaveController saveController = new SaveController(results);

            setScene(loader);
            
            stage.setScene(scene);
            stage.setTitle("Save");
            stage.show();

            Stage myStage = (Stage) this.btnSaveFilm.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * To get as string with the films that the user has searched
     * @return A String in written as a JSON of Films
     */
    public String getResults(){

        String results = "[";
        for(int i = 0; i < tableFilms.size(); i++) {
            results+="\n\t{";
            results +="\n\t\ttitle:" +tableFilms.get(i).getTitle();
            results +="\n\t\toriginal_title:" +tableFilms.get(i).getOriginalTitle();
            results +="\n\t\toriginal_title_romanised:" +tableFilms.get(i).getOriginalTitleRomanised();
            results +="\n\t\trelase_date:" +tableFilms.get(i).getReleaseDate();
            results +="\n\t\timage:" +tableFilms.get(i).getImage();
            results += "\n\t}";
        }
        results += "\n]";

        System.out.println(results);
        return results;
    }

}