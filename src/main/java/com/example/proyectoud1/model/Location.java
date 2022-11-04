package com.example.proyectoud1.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

	private String surfaceWater;
	private String name;
	private int id;
	private String climate;
	private String terrain;

	public Location(int id, String name, String climate, String terrain, String surfaceWater) {
		this.surfaceWater = surfaceWater;
		this.name = name;
		this.id = id;
		this.climate = climate;
		this.terrain = terrain;
	}

	public String getSurfaceWater() { return surfaceWater; }

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getClimate() {
		return climate;
	}

	public String getTerrain() {
		return terrain;
	}
}