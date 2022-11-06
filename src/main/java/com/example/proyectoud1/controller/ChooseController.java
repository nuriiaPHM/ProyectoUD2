package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ChooseController extends Controller{
    public Button btnSelect;
    public Button btnInsert;
    public Button btnDelete;

    public void sPeople(ActionEvent actionEvent) {
        try {
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("people.fxml"));

            PeopleController peopleController = loader.getController();

            setScene(loader);
            stage.setScene(scene);
            stage.setTitle("Characters");
            stage.show();

            Stage myStage = (Stage) this.btnSelect.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void iPeople(ActionEvent actionEvent) {
        try {
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("peopleInsert.fxml"));

            PeopleInsertController pInsertController = loader.getController();

            setScene(loader);
            stage.setScene(scene);
            stage.setTitle("Characters");
            stage.show();

            Stage myStage = (Stage) this.btnInsert.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void dPeople(ActionEvent actionEvent) {
        try {
            ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("peopleInsert.fxml"));

            PeopleInsertController pInsertController = loader.getController();

            setScene(loader);
            stage.setScene(scene);
            stage.setTitle("Characters");
            stage.show();

            Stage myStage = (Stage) this.btnInsert.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
