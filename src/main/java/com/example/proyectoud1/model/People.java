package com.example.proyectoud1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.proyectoud1.controller.PeopleController;
import javafx.scene.control.Button;

public class People {

	/**
	 * Character's gender. Can be number or String like Adult, Teenager...
	 */
	private String gender;

	/**
	 * Character's name
	 */
	private String name;

	/**
	 * Character's id in database
	 */
	private int id;

	/**
	 * Can be male or female
	 */
	private String age;

	/**
	 * Character's hair color
	 */
	private String hairColor;

	/**
	 * Character's delete button
	 */
	public Button button;

	/**
	 * Character's constructor
	 * @param id Character's id in database
	 * @param name Character's name
	 * @param age Character's age
	 * @param gender Character's gender
	 * @param hairColor Character's hair color
	 * @param button Character's delete button
	 */
	public People(int id, String name, String age, String gender, String hairColor, Button button) {
		this.gender = gender;
		this.name = name;
		this.id = id;
		this.age = age;
		this.hairColor = hairColor;
		this.button = button;
	}

	/**
	 * getter method for gender
	 * @return character's gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * getter method for name
	 * @return character's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * getter method for id
	 * @return character's id
	 */
	public int getId() {
		return id;
	}

	/**
	 * getter method for age
	 * @return character's age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * getter method for hair color
	 * @return character's hair color
	 */
	public String getHairColor() {
		return hairColor;
	}

	/**
	 * getter method for delete button
	 * @return character's delete button
	 */
	public Button getButton() {
		return button;
	}


}