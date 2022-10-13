package com.example.proyectoud1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveController extends Controller {

    public Controller controller;
    public String results;

    @FXML
    public TextField txtSave;
    @FXML
    public Button btnSave;

    /**
     *
     * @param controller
     * @param results
     */
    public SaveController(Controller controller, String results) {
        this.controller = controller;
        this.results = results;
    }

    /**
     *
     * @param actionEvent The clic in the button 'btnSave'
     */
    public void save(ActionEvent actionEvent) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(txtSave.getText() + ".txt"));
            if (results == null) {
                System.out.println("Vacio");
            } else {
                bw.write(results);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
