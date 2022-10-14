package com.example.proyectoud1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.controlsfx.control.PrefixSelectionChoiceBox;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveController {

    //public Controller controller ;
    public String results;
    @FXML
    public Button btnSave;
    @FXML
    public TextField txtSave;

    public SaveController() {
    }

    /**
     * Constructor of class SaveController
     * @param results String with the results of films in JSON structure
     */
    public SaveController(String results) {
        this.results = results;
    }

    /**
     *
     * @param actionEvent
     * @throws IOException
     */
    public void save(ActionEvent actionEvent) {
        try {

            if (results == null) {
                System.out.println("Vacio");
            } else {
                BufferedWriter bw = new BufferedWriter(new FileWriter(txtSave.getText() + ".txt"));
                bw.write(results);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
