package com.example.proyectoud1.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javafx.scene.control.Button;

public class People {

	private String gender;
	private String name;
	private int id;
	private String age;
	private String hairColor;

	public People(int id, String name, String age, String gender, String hairColor) {
		this.gender = gender;
		this.name = name;
		this.id = id;
		this.age = age;
		this.hairColor = hairColor;
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getAge() {
		return age;
	}

	public String getHairColor() {
		return hairColor;
	}
}