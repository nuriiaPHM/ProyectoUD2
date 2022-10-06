import java.io.Serializable;
import java.util.ArrayList;

public class People implements Serializable {
    private String id;
    private String name;
    private String gender;
    private String age;
    private String eye_color;
    private String hair_color;
    private ArrayList<Film> films = new ArrayList<>();
    private String species;

    public People(String id, String name, String gender, String age, String eye_color, String hair_color, ArrayList<Film> films, String species) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.eye_color = eye_color;
        this.hair_color = hair_color;
        this.films = films;
        this.species = species;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String getHair_color() {
        return hair_color;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public String getSpecies() {
        return species;
    }
}
