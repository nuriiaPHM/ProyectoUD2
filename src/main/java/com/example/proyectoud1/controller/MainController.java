package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.io.IOException;
import java.util.ArrayList;

public class MainController extends Controller {
    public Button btnCharactersScreen;
    public Button btnFilmsScreen;
    public Button btnLocationScreen;

    @FXML
    public void sFilm(ActionEvent actionEvent) {
        try {
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("films.fxml"));

            FilmController filmController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.btnFilmsScreen.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void sPeople(ActionEvent actionEvent) {
        try {
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("people.fxml"));

            PeopleController peopleController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.btnCharactersScreen.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void sLocation(ActionEvent actionEvent) {
        try {
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("locations.fxml"));

            LocationController locationController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.btnLocationScreen.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
