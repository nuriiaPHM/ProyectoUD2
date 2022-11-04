package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainController extends Controller {
    public Button btnCharactersScreen;
    public Button btnLocationScreen;

    /**
     * Opens the Character searching window
     * @param actionEvent The click in the button
     */
    public void sPeople(ActionEvent actionEvent) {
        try {
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("people.fxml"));

            PeopleController peopleController = loader.getController();
            table = 1;

            setScene(loader);
            scene.setFill(Color.rgb(0,0,255));
            stage.setScene(scene);
            stage.setTitle("Characters");
            stage.show();

            Stage myStage = (Stage) this.btnCharactersScreen.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Opens the Location searching window
     * @param actionEvent The click in the button
     */
    public void sLocation(ActionEvent actionEvent) {
        try {
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("locations.fxml"));

            LocationController locationController = loader.getController();
            table = 2;

            setScene(loader);

            stage.setScene(scene);
            stage.setTitle("Locations");
            stage.show();

            Stage myStage = (Stage) this.btnLocationScreen.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
