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
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class FilmController extends Controller implements Initializable {
    private String filmURL = "https://ghibliapi.herokuapp.com/films?title=";

    @FXML
    public TableView filmTable;
    @FXML
    private TextField filmTitle;
    @FXML
    private Button filmSearch;
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

    private ObservableList<Film> tableFilms;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableFilms = FXCollections.observableArrayList();

        this.oTitle.setCellValueFactory(new PropertyValueFactory("originalTitle"));
        this.rTitle.setCellValueFactory(new PropertyValueFactory("originalTitleRomanised"));
        this.year.setCellValueFactory(new PropertyValueFactory("releaseDate"));

    }
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

    public void goBack(ActionEvent actionEvent){
        try {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("main.fxml"));

            MainController mainController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.btnFilmsGoBack.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveResulst(ActionEvent actionEvent) {

        try {

            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("save.fxml"));
            SaveController saveController = new SaveController(loader.getController(),getResults());

            setScene(loader);

            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.btnSaveTable.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

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