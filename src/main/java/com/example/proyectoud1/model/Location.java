package com.example.proyectoud1.model;

import java.lang.ref.PhantomReference;
import java.sql.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Location {

	private String surfaceWater;
	private String name;
	private int id;
	private String climate;
	private String terrain;
	private Button delete;

	public Location(int id, String name, String climate, String terrain, String surfaceWater, Button delete) {
		this.surfaceWater = surfaceWater;
		this.name = name;
		this.id = id;
		this.climate = climate;
		this.terrain = terrain;
		this.delete = delete;
	}

	public Button getDelete() {return delete;}

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