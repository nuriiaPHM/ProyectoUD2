package com.example.proyectoud1.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
	/**
	 * Location class attributes
	 */
	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("surface_water")
	private String surfaceWater;

	@JsonProperty("name")
	private String name;

	@JsonProperty("residents")
	private List<String> residents;

	@JsonProperty("id")
	private String id;

	@JsonProperty("climate")
	private String climate;

	@JsonProperty("terrain")
	private String terrain;

	@JsonProperty("url")
	private String url;

	/**
	 * Getter of Location class attributes
	 */
	public List<String> getFilms(){
		return films;
	}

	public String getSurfaceWater(){
		return surfaceWater;
	}

	public String getName(){
		return name;
	}

	public List<String> getResidents(){
		return residents;
	}

	public String getId(){
		return id;
	}

	public String getClimate(){
		return climate;
	}

	public String getTerrain(){
		return terrain;
	}

	public String getUrl(){
		return url;
	}
}