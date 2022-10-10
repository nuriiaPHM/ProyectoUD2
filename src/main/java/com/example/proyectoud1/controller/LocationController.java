package com.example.proyectoud1.controller;

import com.example.proyectoud1.model.Film;
import com.example.proyectoud1.model.Location;
import com.example.proyectoud1.model.People;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class LocationController implements Initializable {
    private String filmURL = "https://ghibliapi.herokuapp.com/films?title=";
    private String locationURL = "https://ghibliapi.herokuapp.com/locations?name=";

    @FXML
    public TableView locTable;
    @FXML
    public TableColumn locTFilm;
    @FXML
    public TableColumn locTClimate;
    @FXML
    public TableColumn locTTerrain;
    @FXML
    public TableColumn locTWater;
    @FXML
    public TextField locName;
    @FXML
    public Button locSearch;

    private ObservableList<Location> tableLocation;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableLocation = FXCollections.observableArrayList();

        this.locTClimate.setCellValueFactory(new PropertyValueFactory("climate"));
        this.locTTerrain.setCellValueFactory(new PropertyValueFactory("terrain"));
        this.locTWater.setCellValueFactory(new PropertyValueFactory("surfaceWater"));

    }

    @FXML
    public void searchLocation(ActionEvent actionEvent) {
        try {
            String cadena = "";
            for(int i = 0; i < locName.getText().length(); i++){
                if(locName.getText().charAt(i) == ' '){
                    cadena += "%20";
                } else {
                    cadena += locName.getText().charAt(i);
                }
            }

            URL jsonURL = new URL(locationURL + cadena);

            ObjectMapper objectMapper = new ObjectMapper();
            List<Location> locations = objectMapper.readValue(jsonURL, new TypeReference<List<Location>>() {});
            Location location = locations.get(0);

            tableLocation.add(location);
            this.locTable.setItems(tableLocation);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
