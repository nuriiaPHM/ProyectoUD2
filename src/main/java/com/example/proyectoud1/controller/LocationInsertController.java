package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import com.example.proyectoud1.model.People;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.sql.*;

public class LocationInsertController extends Controller {
    /**
     * JavaFX elements from locationInsert.fxml
     */

    @FXML
    public Button btnLocationInsert;
    @FXML
    public TextField txtName;
    @FXML
    public TextField txtWater;
    @FXML
    public Button btnGoBack;
    @FXML
    public Label lblMessage;
    @FXML
    public ComboBox cboxClimate;
    @FXML
    public ComboBox cboxTerrain;

    /**
     * To insert a location in the database
     * @param actionEvent The click in the button
     */
    @FXML
    public void insert(ActionEvent actionEvent) {

        try (Connection con = DriverManager.getConnection(jdbcUrl, "root", "root")) {

            String name = txtName.getText();
            String climate = cboxClimate.getValue().toString();
            String terrain = cboxTerrain.getValue().toString();
            String water_surface = txtWater.getText();

            String insert = "insert into locations (nam, climate, terrain, water_surface)" +
                    "values ('"+name+"','"+climate+"', '"+terrain+"', '"+water_surface+"');";

            PreparedStatement ps = con.prepareStatement(insert);
            int n_insert = ps.executeUpdate();

            lblMessage.setText("Location inserted: " + name);

            txtName.setText("");
            txtWater.setText("");


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    /**
     * To open again the Main Window
     * @param actionEvent The click in the button
     */
    public void goBack(ActionEvent actionEvent){
        try {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("choose.fxml"));

            ChooseController chooseController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.setTitle("Studio Ghibli");
            stage.show();

            Stage myStage = (Stage) this.btnGoBack.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
