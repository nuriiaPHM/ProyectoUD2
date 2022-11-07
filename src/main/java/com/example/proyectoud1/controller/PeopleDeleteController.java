package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PeopleDeleteController extends Controller {

    @FXML
    public TextField txtName;
    @FXML
    public Button btnGoBack;
    @FXML
    public Label lblMessage;
    @FXML
    public Button btnDelete;

    /**
     * To search a gender in the API
     * @param actionEvent The click in the button
     */
    @FXML
    public void delete(ActionEvent actionEvent) {

        try (Connection con = DriverManager.getConnection(jdbcUrl, "root", "root")) {

            String name = txtName.getText();

            String delete = "delete from characters where nam = '" + name + "'";

            PreparedStatement ps = con.prepareStatement(delete);
            int n_delete = ps.executeUpdate();

            lblMessage.setText("Character deleted: " + name);

            txtName.setText("");


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
