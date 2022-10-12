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

public class LocationController extends Controller implements Initializable {

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
    @FXML
    public Button btnLocBack;
    @FXML
    public Button btnLocSave;
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

    public void locGoBack(ActionEvent actionEvent){
        try {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("main.fxml"));

            MainController mainController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.show();



            Stage myStage = (Stage) this.btnLocBack.getScene().getWindow();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void locSave(ActionEvent actionEvent) {

        try {
            SaveController saveController = new SaveController(new FilmController(),getResults());
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("save.fxml"));

            saveController = loader.getController();
            setScene(loader);

            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.btnLocSave.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String getResults(){

        String results = "[";
        for(int i = 0; i < tableLocation.size(); i++) {
            results+="\n\t{";
            results +="\n\t\tname:" +tableLocation.get(i).getName();
            results +="\n\t\toriginal_title:" +tableLocation.get(i).getClimate();
            results +="\n\t\toriginal_title_romanised:" +tableLocation.get(i).getTerrain();
            results +="\n\t\trelase_date:" +tableLocation.get(i).getSurfaceWater();
            results += "\n\t}";
        }
        results += "\n]";

        System.out.println(results);
        return results;
    }

}
