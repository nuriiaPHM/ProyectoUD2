package com.example.proyectoud1.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class People {

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("eye_color")
	private String eyeColor;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("species")
	private String species;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private String id;

	@JsonProperty("age")
	private String age;

	@JsonProperty("url")
	private String url;

	@JsonProperty("hair_color")
	private String hairColor;

	@JsonProperty("gander")
	private String gander;

	/**
	 * Gets of all People atributes
	 *
	 */
	public List<String> getFilms(){
		return films;
	}

	public String getEyeColor(){
		return eyeColor;
	}

	public String getGender(){
		return gender;
	}

	public String getSpecies(){
		return species;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getAge(){
		return age;
	}

	public String getUrl(){
		return url;
	}

	public String getHairColor(){
		return hairColor;
	}

	public String getGander(){
		return gander;
	}
}