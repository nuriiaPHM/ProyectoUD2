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
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class PeopleController extends Controller implements Initializable {

    private String peopleURL = "https://ghibliapi.herokuapp.com/people?gender=";

    @FXML
    public TextField txtSave;
    @FXML
    public ComboBox cboxGender;
    @FXML
    private Button peopleSearch;
    @FXML
    private Button btnPeopleBack;
    @FXML
    private Button btnSavePeople;
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

    /**
     * To set an attribute of People in each column of the table
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tablePeople = FXCollections.observableArrayList();
        this.peopleTName.setCellValueFactory(new PropertyValueFactory("name"));
        this.peopleTAge.setCellValueFactory(new PropertyValueFactory("age"));
        this.peopleTGender.setCellValueFactory(new PropertyValueFactory("gender"));
        this.peopleTHair.setCellValueFactory(new PropertyValueFactory("hairColor"));

    }

    /**
     * To search a gender in the API
     * @param actionEvent The click in the button
     */
    @FXML
    public void peopleSearch(ActionEvent actionEvent) {
        try {
            tablePeople.remove(0,tablePeople.size());

            URL jsonURL = new URL(peopleURL + cboxGender.getValue());

            ObjectMapper objectMapper = new ObjectMapper();
            List<People> peoples = objectMapper.readValue(jsonURL, new TypeReference<List<People>>() {});

            for(int i = 0; i < peoples.size(); i++){
                People people = peoples.get(i);
                tablePeople.add(people);

            }
            this.peopleTable.setItems(tablePeople);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * To open again the Main Window
     * @param actionEvent The click in the button
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
     * To save the characters that the user searched
     * @param actionEvent The click in the button
     */
    public void peopleSave(ActionEvent actionEvent) {
        String results = getResults();
        System.out.println(results);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(txtSave.getText()+".json"))) {
            writer.write(results);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    /**
     * To get as string with the characters that the user searched
     * @return A String written as a JSON of People
     */
    public String getResults(){

        String results = "[";
        for(int i = 0; i < tablePeople.size(); i++) {
            results += "\n\t{";
            results += "\n\t\t\"name\":\"" +tablePeople.get(i).getName() + "\",";
            results += "\n\t\t\"age\":\"" +tablePeople.get(i).getAge() + "\",";
            results += "\n\t\t\"gender\":\"" +tablePeople.get(i).getGender() + "\",";
            results += "\n\t\t\"hair color\":\"" +tablePeople.get(i).getHairColor() + "\"";
            if(i + 1 < tablePeople.size()){
                results += "\n\t},";
            } else {
                results += "\n\t}";
            }
        }
        results += "\n]";

        return results;
    }

}
