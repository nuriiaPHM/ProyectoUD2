package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import com.example.proyectoud1.model.Film;
import com.example.proyectoud1.model.Location;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class PeopleController extends Controller implements Initializable {

    private String filmURL = "https://ghibliapi.herokuapp.com/films?title=";
    private String peopleURL = "https://ghibliapi.herokuapp.com/people?name=";

    @FXML
    public Button peopleSearch;
    @FXML
    public Button btnPeopleBack;
    @FXML
    public Button btnSavePeople;
    @FXML
    public TextField peopleName;
    @FXML
    public TableView peopleTable;
    @FXML
    public TableColumn peopleTFilm;
    @FXML
    public TableColumn peopleTAge;
    @FXML
    public TableColumn peopleTGender;
    @FXML
    public TableColumn peopleTHair;

    private ObservableList<People> tablePeople;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tablePeople = FXCollections.observableArrayList();

        this.peopleTAge.setCellValueFactory(new PropertyValueFactory("age"));
        this.peopleTGender.setCellValueFactory(new PropertyValueFactory("gender"));
        this.peopleTHair.setCellValueFactory(new PropertyValueFactory("hairColor"));

    }

    @FXML
    public void searchPeople(ActionEvent actionEvent) {
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

    public void peopleGoBack(ActionEvent actionEvent){
        try {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("main.fxml"));


            MainController mainController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.btnPeopleBack.getScene().getWindow();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void peopleSave(ActionEvent actionEvent) {

        try {
            SaveController saveController = new SaveController(new FilmController(),getResults());
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("save.fxml"));

            saveController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
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
