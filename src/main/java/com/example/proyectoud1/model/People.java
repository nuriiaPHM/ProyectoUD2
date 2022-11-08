package com.example.proyectoud1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Button;

public class People {

	private String gender;
	private String name;
	private int id;
	private String age;
	private String hairColor;
	private Button button;

	public People(int id, String name, String age, String gender, String hairColor, Button button) {
		this.gender = gender;
		this.name = name;
		this.id = id;
		this.age = age;
		this.hairColor = hairColor;
		this.button = button;

		button.setOnAction(actionEvent -> {
			String jdbcUrl = "jdbc:mysql://localhost:3306/studio_ghibli";
			try (Connection con = DriverManager.getConnection(jdbcUrl, "root", "root")) {
				String delete = "delete from characters where id = '" + id + "'";

				PreparedStatement ps = con.prepareStatement(delete);

				int n_delete = ps.executeUpdate();

			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		});
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

	public Button getButton() {
		return button;
	}


}