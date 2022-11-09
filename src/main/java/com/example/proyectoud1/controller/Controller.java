package com.example.proyectoud1.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    /**
     * Database connection url
     */
    protected String jdbcUrl = "jdbc:mysql://localhost:3306/studio_ghibli";

    /**
     * Application's stage
     */
    protected Stage stage = new Stage();

    /**
     * Application's parent
     */
    protected Parent root = new Parent() {};

    /**
     * Application's Scene
     */
    protected Scene scene = new Scene(root);

    /**
     * getter method for stage
     * @return application's stage
     */
    public Stage getStage() {
        return stage;
    }

    /**
     * setter method for stage
     * @param stage application's stage
     */
    public void setStage(Stage stage) {
            this.stage = stage;

    }

    /**
     * setter method for scene
     * @param fxmlLoader application's fxml loader
     */
    public void setScene(FXMLLoader fxmlLoader) {
        try {
            root = fxmlLoader.load();
            this.scene = new Scene(root);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


}
