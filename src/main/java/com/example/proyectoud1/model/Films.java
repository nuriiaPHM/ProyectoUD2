package com.example.proyectoud1.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Films {

	@JsonProperty("image")
	private String image;

	@JsonProperty("original_title")
	private String originalTitle;

	@JsonProperty("director")
	private String director;

	@JsonProperty("description")
	private String description;

	@JsonProperty("vehicles")
	private List<String> vehicles;

	@JsonProperty("title")
	private String title;

	@JsonProperty("rt_score")
	private String rtScore;

	@JsonProperty("people")
	private List<String> people;

	@JsonProperty("url")
	private String url;

	@JsonProperty("release_date")
	private String releaseDate;

	@JsonProperty("species")
	private List<String> species;

	@JsonProperty("original_title_romanised")
	private String originalTitleRomanised;

	@JsonProperty("producer")
	private String producer;

	@JsonProperty("running_time")
	private String runningTime;

	@JsonProperty("locations")
	private List<String> locations;

	@JsonProperty("id")
	private String id;

	@JsonProperty("movie_banner")
	private String movieBanner;

	public String getImage(){
		return image;
	}

	public String getOriginalTitle(){
		return originalTitle;
	}

	public String getDirector(){
		return director;
	}

	public String getDescription(){
		return description;
	}

	public List<String> getVehicles(){
		return vehicles;
	}

	public String getTitle(){
		return title;
	}

	public String getRtScore(){
		return rtScore;
	}

	public List<String> getPeople(){
		return people;
	}

	public String getUrl(){
		return url;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public List<String> getSpecies(){
		return species;
	}

	public String getOriginalTitleRomanised(){
		return originalTitleRomanised;
	}

	public String getProducer(){
		return producer;
	}

	public String getRunningTime(){
		return runningTime;
	}

	public List<String> getLocations(){
		return locations;
	}

	public String getId(){
		return id;
	}

	public String getMovieBanner(){
		return movieBanner;
	}
}