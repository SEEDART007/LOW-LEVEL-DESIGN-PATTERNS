package BookMyShowLLD;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Theatre> theatres;

    public City(String name) {
        this.name = name;
        this.theatres = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre){
        this.theatres.add(theatre);
    }

    public String getName() {
        return name;
    }

    public List<Theatre> getTheatres() {
        return theatres;
    }
}
