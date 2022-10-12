package com.example.proyectoud1.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Film {

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

	/**
	 *
	 * @return : Returns image's URL
	 */
	public String getImage(){
		return image;
	}

	/**
	 *
	 * @return : Returns the tilte in its original lenguage
	 */
	public String getOriginalTitle(){
		return originalTitle;
	}

	/**
	 *
	 * @return : Returns the director's name
	 */
	public String getDirector(){
		return director;
	}

	/**
	 *
	 * @return : Returns the description of the film
	 */
	public String getDescription(){
		return description;
	}

	/**
	 *
	 * @return : Returns a Lists of Strings whith the vehicles
	 */
	public List<String> getVehicles(){
		return vehicles;
	}

	/**
	 *
	 * @return : Returns the title of thr Film
	 */
	public String getTitle(){
		return title;
	}

	/**
	 *
	 * @return : Retruns the score of a Film
	 */
	public String getRtScore(){
		return rtScore;
	}

	/**
	 *
	 * @return : Returns a List of Characters from a Film
	 */
	public List<String> getPeople(){
		return people;
	}

	/**
	 *
	 * @return : Returns the URL of the Films
	 */
	public String getUrl(){
		return url;
	}

	/**
	 *
	 * @return : Returns the release date of a Film
	 */
	public String getReleaseDate(){
		return releaseDate;
	}

	/**
	 *
	 * @return : Returns the all teh Species of a Film
	 */
	public List<String> getSpecies(){
		return species;
	}

	/**
	 *
	 * @return : Returns the tilte romanised in its original lenguage
	 */
	public String getOriginalTitleRomanised(){
		return originalTitleRomanised;
	}

	/**
	 *
	 * @return : Returns the Films's producer
	 */
	public String getProducer(){
		return producer;
	}

	/**
	 *
	 * @return Returns the runing time of the Film
	 */
	public String getRunningTime(){
		return runningTime;
	}

	/**
	 *
	 * @return : Returns all the locations of the Films
	 */
	public List<String> getLocations(){
		return locations;
	}

	/**
	 *
	 * @return : Retturns the Flilm's id
	 */
	public String getId(){
		return id;
	}

	/**
	 *
	 * @return Retruns the movie banner
	 */
	public String getMovieBanner(){
		return movieBanner;
	}
}