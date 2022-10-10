package com.example.proyectoud1.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FilmResponse {

	@JsonProperty("FilmResponse")
	private List<Film> response;

	public List<Film> getResponse(){
		return response;
	}
}