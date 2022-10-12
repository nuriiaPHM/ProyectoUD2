package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import com.example.proyectoud1.model.People;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class PeopleController extends Controller implements Initializable {

    private String filmURL = "https://ghibliapi.herokuapp.com/films?title=";
    private String peopleURL = "https://ghibliapi.herokuapp.com/people?name=";

    @FXML
    private Button peopleSearch;
    @FXML
    private Button btnPeopleBack;
    @FXML
    private Button btnSavePeople;
    @FXML
    private TextField peopleName;
    @FXML
    private TableView peopleTable;
    @FXML
    public TableColumn peopleTName;
    @FXML
    private TableColumn peopleTAge;
    @FXML
    private TableColumn peopleTGender;
    @FXML
    private TableColumn peopleTHair;

    private ObservableList<People> tablePeople;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tablePeople = FXCollections.observableArrayList();
        this.peopleTName.setCellValueFactory(new PropertyValueFactory("name"));
        this.peopleTAge.setCellValueFactory(new PropertyValueFactory("age"));
        this.peopleTGender.setCellValueFactory(new PropertyValueFactory("gender"));
        this.peopleTHair.setCellValueFactory(new PropertyValueFactory("hairColor"));

    }

    /**
     *
     * @param actionEvent The clic in the button
     */
    @FXML
    public void peopleSearch(ActionEvent actionEvent) {
        try {
            String cadena = "";
            for (int i = 0; i < peopleName.getText().length(); i++) {
                if (peopleName.getText().charAt(i) == ' ') {
                    cadena += "%20";
                } else {
                    cadena += peopleName.getText().charAt(i);
                }
            }
            URL jsonURL = new URL(peopleURL + cadena);

            ObjectMapper objectMapper = new ObjectMapper();
            List<People> peoples = objectMapper.readValue(jsonURL, new TypeReference<List<People>>() {
            });
            People people = peoples.get(0);

            tablePeople.add(people);
            this.peopleTable.setItems(tablePeople);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param actionEvent The clic in the button
     */
    public void peopleGoBack(ActionEvent actionEvent){
        try {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("main.fxml"));

            MainController mainController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.setTitle("Studio Ghibli");
            stage.show();

            Stage myStage = (Stage) this.btnPeopleBack.getScene().getWindow();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param actionEvent The clic in the button
     */
    public void peopleSave(ActionEvent actionEvent) {

        try {
            SaveController saveController = new SaveController(new FilmController(),getResults());
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("save.fxml"));

            saveController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.setTitle("Save");
            stage.show();

            Stage myStage = (Stage) this.btnSavePeople.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String getResults(){

        String results = "[";
        for(int i = 0; i < tablePeople.size(); i++) {
            results+="\n\t{";
            results +="\n\t\tname:" +tablePeople.get(i).getName();
            results +="\n\t\tage:" +tablePeople.get(i).getAge();
            results +="\n\t\tgender:" +tablePeople.get(i).getGender();
            results +="\n\t\thair color:" +tablePeople.get(i).getHairColor();
            results += "\n\t}";
        }
        results += "\n]";

        System.out.println(results);
        return results;
    }

}
