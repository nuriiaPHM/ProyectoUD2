package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class ChooseController extends Controller{
    /**
     * JavaFX elements from choose.fxml
     */

    @FXML
    public Button btnSelect;
    @FXML
    public Button btnInsert;
    @FXML
    public ToggleGroup btnGroup;
    @FXML
    public RadioButton btnCharacter;
    @FXML
    public RadioButton btnLocation;

    /**
     * Loads select window for characters or locations
     * @param actionEvent The click in the button
     */
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

    /**
     * Loads insert window for characters or locations
     * @param actionEvent The click in the button
     */
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
                FXMLLoader loader = new FXMLLoader(Main.class.getResource("locationInsert.fxml"));

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
