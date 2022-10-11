package com.example.proyectoud1.controller;

import javafx.stage.Stage;

import java.util.Stack;

public abstract class Controller {
    protected Stage stage;

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
            this.stage = stage;

    }
}
