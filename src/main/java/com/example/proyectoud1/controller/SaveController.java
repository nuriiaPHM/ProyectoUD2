package com.example.proyectoud1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveController extends Controller{

    public Controller controller;
    public String results;

    @FXML
    public TextField txtSave;
    @FXML
    public Button btnSave;

    public SaveController(Controller controller, String results) {
        this.controller = controller;
        this.results = results;
    }

    public void save(ActionEvent actionEvent) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(txtSave.getText() + ".txt"));
        if (results == null) {
            System.out.println("Vacio");
        } else {
            bw.write(results);
        }
    }

}
