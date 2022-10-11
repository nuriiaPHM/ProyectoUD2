package com.example.proyectoud1;

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
        Parent root = FXMLLoader.load((getClass().getResource("main.fxml")));
        stage.setTitle("Studio Ghibli");
        stage.setScene(new Scene(root, 379, 164));
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}