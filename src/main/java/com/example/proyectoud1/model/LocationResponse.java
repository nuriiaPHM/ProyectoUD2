package com.example.proyectoud1.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationResponse{

	@JsonProperty("LocationResponse")
	private List<Location> locationResponse;

	/**
	 * To gets the locations
	 * @return Returns a List of Locations
	 */
	public List<Location> getLocationResponse(){
		return locationResponse;
	}
}