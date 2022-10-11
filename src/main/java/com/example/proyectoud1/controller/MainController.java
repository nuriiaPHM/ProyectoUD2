package com.example.proyectoud1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.io.IOException;

public class MainController {
    public Button btnCharactersScreen;
    public Button btnFilmsScreen;
    public Button btnLocationScreen;
    @FXML
    public void sFilm(ActionEvent actionEvent) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("com.example.proyectoud1.films.fxml"));

            Parent root = loader.load();

            FilmController filmController = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> filmController.closeWindows());
            Stage myStage = (Stage) this.btnFilmsScreen.getScene().getWindow();
            myStage.close();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
/*
    public void sPeople(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("film.fxml"));
        stage.setTitle("Studio Ghibli");
        stage.setScene(new Scene(root, 379, 164));
        stage.show();
    }

    public void sLocation(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("film.fxml"));
        stage.setTitle("Studio Ghibli");
        stage.setScene(new Scene(root, 379, 164));
        stage.show();
    }*/

}
