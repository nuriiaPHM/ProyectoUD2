package com.example.proyectoud1.controller;

import com.example.proyectoud1.Main;
import com.example.proyectoud1.model.People;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class InsertController extends Controller implements Initializable {

    /**
     * To set an attribute of People in each column of the table
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    /**
     * To search a gender in the API
     * @param actionEvent The click in the button
     */
    @FXML
    public void peopleSearch(ActionEvent actionEvent) {

        try(Connection con = DriverManager.getConnection(jdbcUrl, "root", "root")) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM characters where gender = '" + cboxGender.getValue() + "'");

            tablePeople.remove(0,tablePeople.size());

            while (rs.next()){
                int id = rs.getInt("id");
                String nam = rs.getString("nam");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                String hair = rs.getString("hair_color");

                People people = new People(id,nam,age,gender,hair);

                tablePeople.add(people);
            }
            this.peopleTable.setItems(tablePeople);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * To open again the Main Window
     * @param actionEvent The click in the button
     */
    public void insertGoBack(ActionEvent actionEvent){
        try {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("main.fxml"));

            MainController mainController = loader.getController();

            setScene(loader);

            stage.setScene(scene);
            stage.setTitle("Studio Ghibli");
            stage.show();

            Stage myStage = (Stage) this.btnPeopleBack.getScene().getWindow();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
