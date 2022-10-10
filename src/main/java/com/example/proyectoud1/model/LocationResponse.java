package com.example.proyectoud1.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationResponse{

	@JsonProperty("LocationResponse")
	private List<Location> locationResponse;

	public List<Location> getLocationResponse(){
		return locationResponse;
	}
}