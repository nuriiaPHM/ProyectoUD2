package com.example.proyectoud1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    public Button btnCharactersScreen;
    public Button btnFilmsScreen;
    public Button btnLocationScreen;
/*
    public void sFilm(ActionEvent actionEvent) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("film.fxml"));


            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> FilmController.closeWindows);
            Stage myStage = (Stage) this.btnFilmsScreen.getScene().getWindow();
            myStage.close();


            stage.setTitle("Studio Ghibli");
            stage.setScene(new Scene(root, 379, 164));
            stage.show();
        } catch (IOException e) {

        }
    }

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
    }
*/
}
