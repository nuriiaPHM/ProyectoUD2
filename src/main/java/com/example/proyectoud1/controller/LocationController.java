package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import com.example.proyectoud1.model.Location;
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
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class LocationController extends Controller implements Initializable {

    private String locationURL = "https://ghibliapi.herokuapp.com/locations?terrain=";

    @FXML
    public TableView locTable;
    @FXML
    public TableColumn locTClimate;
    @FXML
    public TableColumn locTTerrain;
    @FXML
    public TableColumn locTWater;
    @FXML
    public TableColumn locTName;
    @FXML
    public TextField locName;
    @FXML
    public Button locSearch;
    @FXML
    public Button btnLocBack;
    @FXML
    public Button btnLocSave;
    @FXML
    public TextField txtLocSave;
    @FXML
    public ComboBox cboxTerrain;

    private ObservableList<Location> tableLocation;

    /**
     * To set an attribute of locations in each column of the table
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableLocation = FXCollections.observableArrayList();
        this.locTName.setCellValueFactory(new PropertyValueFactory("name"));
        this.locTClimate.setCellValueFactory(new PropertyValueFactory("climate"));
        this.locTTerrain.setCellValueFactory(new PropertyValueFactory("terrain"));
        this.locTWater.setCellValueFactory(new PropertyValueFactory("surfaceWater"));

    }

    /**
     *  To search the terrain in the API
     * @param actionEvent The click in the button
     */
    @FXML
    public void searchLocation(ActionEvent actionEvent) {

        try {
            tableLocation.remove(0,tableLocation.size());

            URL jsonURL = new URL(locationURL + cboxTerrain.getValue());

            ObjectMapper objectMapper = new ObjectMapper();
            List<Location> locations = objectMapper.readValue(jsonURL, new TypeReference<List<Location>>() {});
            for(int i = 0; i < locations.size() ;i++) {
                Location location = locations.get(i);
                tableLocation.add(location);

            }
            this.locTable.setItems(tableLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * To open again the Main Window
     * @param actionEvent The click in the button
     */
    public void locGoBack(ActionEvent actionEvent){
        try {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("main.fxml"));

            MainController mainController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.setTitle("Studio Ghibli");
            stage.show();

            Stage myStage = (Stage) this.btnLocBack.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * To save the Locations that the user has searched
     * @param actionEvent The click in the button
     */
    public void locSave(ActionEvent actionEvent) {

        String results = getResults();
        System.out.println(results);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(txtLocSave.getText()+".json"))) {
            writer.write(results);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    /**
     * To get as string with the locations that the user has searched
     * @return A String in written as a JSON of Locations
     */
    public String getResults(){

        String results = "[";
        for(int i = 0; i < tableLocation.size(); i++) {
            results+="\n\t{";
            results +="\n\t\t\"name\":\"" +tableLocation.get(i).getName() + "\",";
            results +="\n\t\t\"original_title\":\"" +tableLocation.get(i).getClimate() + "\",";
            results +="\n\t\t\"original_title_romanised\":\"" +tableLocation.get(i).getTerrain() + "\",";
            results +="\n\t\t\"relase_date\":\"" +tableLocation.get(i).getSurfaceWater() + "\",";
            if(i + 1 < tableLocation.size()){
                results += "\n\t},";
            } else {
                results += "\n\t}";
            }
        }
        results += "\n]";

        System.out.println(results);
        return results;
    }

}
