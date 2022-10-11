package com.example.proyectoud1.controller;

import javafx.event.ActionEvent;
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
    public Button btnSave;
    public Controller controller ;

    public String results;
    public TextField txtSave;

    public SaveController() {
    }

    public SaveController(Controller controller, String results) {
        if (controller == null){
            this.controller = new Controller();
            this.results = "";
        }else{
            this.controller = controller;
            this.results = results;
        }
    }

    public void save(ActionEvent actionEvent) throws IOException {
            BufferedWriter bw = new BufferedWriter(new FileWriter(txtSave.getText()+".txt"));
            if(results == null){
                System.out.println("Vacio");
            }else {
                bw.write(results);
            }
    }

}
