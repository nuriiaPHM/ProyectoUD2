package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.io.IOException;

public class MainController extends Controller {
    public Button btnCharactersScreen;
    public Button btnFilmsScreen;
    public Button btnLocationScreen;
    @FXML
    public void sFilm(ActionEvent actionEvent) {
        try {

            FXMLLoader loader = new FXMLLoader(Main.class.getResource("films.fxml"));

            Parent root = loader.load();

            FilmController filmController = loader.getController();

            Scene scene = new Scene(root);


            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> filmController.closeWindows());
            stage = (Stage) this.btnFilmsScreen.getScene().getWindow();
            stage.close();


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
