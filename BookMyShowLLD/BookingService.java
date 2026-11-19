package BookMyShowLLD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookingService {
    private static BookingService instance;
    private List<City> cities;
    private int bookingCounter=1;

    private BookingService(){
        this.cities = new ArrayList<>();
    }
    public static synchronized BookingService getInstance(){
        if(instance==null){
            instance = new BookingService();
        }
        return instance;
    }
    public void addCity(City city){
        this.cities.add(city);
    }
    public List<Movie> searchMovie(String cityName){
         List<Movie> movies = new ArrayList<>();
         City city = cities.stream()
                 .filter(s->s.getName().equalsIgnoreCase(cityName))
                 .findFirst()
                 .orElse(null);
         if(city==null){
             return movies;
         }
         for(Theatre theatre: city.getTheatres()){
             for(Screen screen : theatre.getScreenList()){
                 for(Show show : screen.getShowList()){
                     movies.add(show.getMovie());
                 }
             }
         }
         return movies.stream().distinct().collect(Collectors.toList());
    }
    public Booking bookTicket(Show show, List<Integer> seatIds){
          if(show.bookSeats(seatIds)){
              Booking booking = new Booking(bookingCounter++,show,seatIds);
              return booking;
          }
          return null;
    }
}

