package com.example.proyectoud1.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    protected String jdbcUrl = "jdbc:mysql://localhost:3306/bbdd_studio_ghibli";

    protected Stage stage = new Stage();
    protected Parent root = new Parent() {
    };
    protected Scene scene = new Scene(root);

    public Stage getStage() {
        return stage;
    }

    /**
     * To set a stage to the class
     * @param stage : The Stage to set
     */
    public void setStage(Stage stage) {
            this.stage = stage;

    }

    /**
     * Set the scene to Controller a Class
     * @param fxmlLoader Select the class that wants to controller
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
