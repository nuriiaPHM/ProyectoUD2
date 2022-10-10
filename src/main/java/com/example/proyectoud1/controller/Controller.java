package com.example.proyectoud1.controller;

import com.example.proyectoud1.model.Film;
import com.example.proyectoud1.model.Location;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Controller {
    private String filmURL = "https://ghibliapi.herokuapp.com/films?title=";
    private String locationURL = "https://ghibliapi.herokuapp.com/locations?name=";
    @FXML
    private TextField title;
    @FXML
    private Button search;
    @FXML
    private Label oTitle;
    @FXML
    private Label rTitle;
    @FXML
    private Label year;
    @FXML
    private ImageView image;

    @FXML
    public void searchFilm(ActionEvent actionEvent) {
        try {
            String cadena = "";
            for(int i = 0; i < title.getText().length(); i++){
                if(title.getText().charAt(i) == ' '){
                    cadena += "%20";
                } else {
                    cadena += title.getText().charAt(i);
                }
            }

            URL jsonURL = new URL(filmURL + cadena);

            ObjectMapper objectMapper = new ObjectMapper();

            //FilmResponse response = objectMapper.readValue(jsonURL, FilmResponse.class);
            List<Film> films = objectMapper.readValue(jsonURL, new TypeReference<List<Film>>() {});
            Film film = films.get(0);
            oTitle.setText(String.valueOf(film.getOriginalTitle()));
            rTitle.setText(String.valueOf(film.getOriginalTitleRomanised()));
            year.setText(String.valueOf(film.getReleaseDate()));
            Image banner = new Image(film.getMovieBanner(), true);
            image.setImage(banner);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void searchLocation(ActionEvent actionEvent) {
        try {
            String cadena = "";
            for(int i = 0; i < title.getText().length(); i++){
                if(title.getText().charAt(i) == ' '){
                    cadena += "%20";
                } else {
                    cadena += title.getText().charAt(i);
                }
            }

            URL jsonURL = new URL(locationURL + cadena);

            ObjectMapper objectMapper = new ObjectMapper();

            List<Location> locations = objectMapper.readValue(jsonURL, new TypeReference<List<Location>>() {});
            Location location = locations.get(0);
            oTitle.setText(String.valueOf(location.getClimate()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}