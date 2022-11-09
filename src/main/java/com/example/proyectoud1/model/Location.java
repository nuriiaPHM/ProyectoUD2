package com.example.proyectoud1.model;

import java.lang.ref.PhantomReference;
import java.sql.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Location {

	/**
	 * Location's water surface
	 */
	private String surfaceWater;

	/**
	 * Location's name
	 */
	private String name;

	/**
	 * Location's id in database
	 */
	private int id;

	/**
	 * Location's climate
	 */
	private String climate;

	/**
	 * Location's type of terrain
	 */
	private String terrain;

	/**
	 * Location's delete button
	 */
	private Button delete;

	/**
	 * Location's constructor
	 * @param id Location's id in database
	 * @param name Location's name
	 * @param climate Location's climate
	 * @param terrain Location's type of terrain
	 * @param surfaceWater Location's water surface
	 * @param delete Location's delete button
	 */
	public Location(int id, String name, String climate, String terrain, String surfaceWater, Button delete) {
		this.surfaceWater = surfaceWater;
		this.name = name;
		this.id = id;
		this.climate = climate;
		this.terrain = terrain;
		this.delete = delete;
	}

	/**
	 * getter method for delete button
	 * @return location's delete button
	 */
	public Button getDelete() {return delete;}

	/**
	 * getter method for water surface
	 * @return location's water surface
	 */
	public String getSurfaceWater() { return surfaceWater; }

	/**
	 * getter method for name
	 * @return location's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * getter method for id in database
	 * @return location's id in database
	 */
	public int getId() {
		return id;
	}

	/**
	 * getter method for climate
	 * @return location's climate
	 */
	public String getClimate() {
		return climate;
	}

	/**
	 * getter method for type of terrain
	 * @return location's type of terrain
	 */
	public String getTerrain() {
		return terrain;
	}
}