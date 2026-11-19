package BookMyShowLLD;

import java.awt.print.Book;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Seat> seats = new ArrayList<>();
        for(int i=1;i<10;i++){
            seats.add(new Seat(i,SeatType.REGULAR));
        }
        Movie movie = new Movie(1,"KGF",130,"action");
        Show show = new Show(1,movie, LocalDateTime.now().plusHours(1),seats);

        Screen screen = new Screen(1);
        screen.addShow(show);

        Theatre theatre = new Theatre("PVR");
        theatre.addScreen(screen);

        City city = new City("Delhi");
        city.addTheatre(theatre);

        BookingService bookingService = BookingService.getInstance();
        bookingService.addCity(city);

        System.out.println("Movies running in Delhi");
        List<Movie> movies = bookingService.searchMovie("Delhi");
        for(Movie moviee : movies){
            System.out.println("- "+moviee.getTitle());
        }

        System.out.println("\n Available Seats before booking...");
        show.getAvailableSeats().forEach(s-> System.out.print(s.getSeatId()+" "));
        System.out.println();

        List<Integer> seatToBook = Arrays.asList(2,4,5);
        Booking booking = bookingService.bookTicket(show,seatToBook);

        if(booking!=null){
            System.out.println("\nBooking successful with bookingId "+booking);
            System.out.println("Seats booked "+seatToBook);

        }else{
            System.out.println("Booking failed");
        }

        System.out.println("\n Available Seats after booking...");
        show.getAvailableSeats().forEach(s-> System.out.print(s.getSeatId()+" "));
        System.out.println();



    }
}
