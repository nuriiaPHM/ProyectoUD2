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

public class PeopleInsertController extends Controller {

    @FXML
    public Button btnPeopleInsert;
    @FXML
    public TextField txtName;
    @FXML
    public TextField txtAge;
    @FXML
    public ComboBox cboxGender;
    @FXML
    public TextField txtHair;
    @FXML
    public Button btnGoBack;
    public Label lblMessage;

    /**
     * To search a gender in the API
     * @param actionEvent The click in the button
     */
    @FXML
    public void insert(ActionEvent actionEvent) {

        try (Connection con = DriverManager.getConnection(jdbcUrl, "root", "root")) {

            String name = txtName.getText();
            String age = txtAge.getText();
            String gender = cboxGender.getValue().toString();
            String hair = txtHair.getText();

            String insert = "insert into characters (nam, age, gender, hair_color)" +
                    "values ('"+name+"','"+age+"', '"+gender+"', '"+hair+"');";

            PreparedStatement ps = con.prepareStatement(insert);
            int n_insert = ps.executeUpdate();

            lblMessage.setText("Character inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * To open again the Main Window
     * @param actionEvent The click in the button
     */
    public void pInsertGoBack(ActionEvent actionEvent){
        try {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("main.fxml"));

            MainController mainController = loader.getController();

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
