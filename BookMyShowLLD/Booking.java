package BookMyShowLLD;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {
    private int bookingId;
    private Show show;
    private List<Integer> seatIds;
    private LocalDateTime bookingTime;

    public Booking(int bookingId, Show show, List<Integer> seats) {
        this.bookingId = bookingId;
        this.show = show;
        this.seatIds = seats;
        this.bookingTime = LocalDateTime.now();
    }
}
