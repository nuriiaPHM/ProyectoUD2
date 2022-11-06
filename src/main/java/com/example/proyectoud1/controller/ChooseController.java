package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class ChooseController extends Controller{
    public Button btnSelect;
    public Button btnInsert;
    public Button btnDelete;
    public ToggleGroup btnGroup;
    public RadioButton btnCharacter;
    public RadioButton btnLocation;

    public void select(ActionEvent actionEvent) {
        if (btnCharacter.isSelected()){
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
        } else if (btnLocation.isSelected()){
            try {
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("locations.fxml"));

                LocationController locationController = loader.getController();

                setScene(loader);
                stage.setScene(scene);
                stage.setTitle("Locations");
                stage.show();

                Stage myStage = (Stage) this.btnSelect.getScene().getWindow();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void insert(ActionEvent actionEvent) {
        if (btnCharacter.isSelected()){
            try {
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("peopleInsert.fxml"));

                PeopleInsertController peopleInsertController = loader.getController();

                setScene(loader);
                stage.setScene(scene);
                stage.setTitle("Characters");
                stage.show();

                Stage myStage = (Stage) this.btnSelect.getScene().getWindow();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (btnLocation.isSelected()){
            try {
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("locationsInsert.fxml"));

                LocationInsertController locationInsertController = loader.getController();

                setScene(loader);
                stage.setScene(scene);
                stage.setTitle("Locations");
                stage.show();

                Stage myStage = (Stage) this.btnSelect.getScene().getWindow();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void delete(ActionEvent actionEvent) {
        if (btnCharacter.isSelected()){
            try {
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("peopleInsert.fxml"));

                PeopleInsertController peopleInsertController = loader.getController();

                setScene(loader);
                stage.setScene(scene);
                stage.setTitle("Characters");
                stage.show();

                Stage myStage = (Stage) this.btnSelect.getScene().getWindow();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (btnLocation.isSelected()){
            try {
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("locationsInsert.fxml"));

                LocationInsertController locationInsertController = loader.getController();

                setScene(loader);
                stage.setScene(scene);
                stage.setTitle("Locations");
                stage.show();

                Stage myStage = (Stage) this.btnSelect.getScene().getWindow();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
