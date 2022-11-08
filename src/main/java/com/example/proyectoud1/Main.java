package com.example.proyectoud1;

import com.example.proyectoud1.controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    /**
     * Launches the application
     */
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("choose.fxml"));
        Parent root = fxmlLoader.load();
        stage.setTitle("Studio Ghibli");
        stage.setScene(new Scene(root, 340, 184));
        ((Controller) fxmlLoader.getController()).setStage(stage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}