package BookMyShowLLD;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Show {
    private int showId;
    private Movie movie;
    private LocalDateTime startTime;
    private List<Seat> seats;

    public Show(int showId, Movie movie, LocalDateTime startTime, List<Seat> seats) {
        this.showId = showId;
        this.movie = movie;
        this.startTime = startTime;
        this.seats = seats;
    }

    public int getShowId() {
        return showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public List<Seat> getAvailableSeats(){
          return seats.stream()
                  .filter(Seat::isAvailable)
                  .collect(Collectors.toList());
    }
    public boolean bookSeats(List<Integer> seatIds){
          for(Integer id : seatIds) {
              Seat seat = seats.stream()
                      .filter(s -> s.getSeatId() == id)
                      .findFirst()
                      .orElse(null);
              if (seat == null || !seat.isAvailable()) {
                  return false;
              }
          }
              for(Integer id: seatIds){
                  seats.stream()
                          .filter(s->s.getSeatId()==id)
                          .findFirst()
                          .get()
                          .book();
              }
              return true;


    }
 }
