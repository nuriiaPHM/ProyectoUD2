package com.example.proyectoud1;

import com.example.proyectoud1.controller.Controller;
import com.example.proyectoud1.controller.FilmController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent root = fxmlLoader.load();
        stage.setTitle("Studio Ghibli");
        stage.setScene(new Scene(root, 379, 164));
        ((Controller)fxmlLoader.getController()).setStage(stage);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}