package com.example.proyectoud1.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PeopleResponse{

	@JsonProperty("PeopleResponse")
	private List<People> peopleResponse;

	/**
	 * To get a People list
	 * Returns a List of People
	 */
	public List<People> getPeopleResponse(){
		return peopleResponse;
	}
}