package BookMyShowLLD;

public class Seat {
    private int seatId;
    private SeatType seatType;
    private SeatStatus status;

    public Seat(int seatId, SeatType seatType) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.status = SeatStatus.AVAILABLE;
    }

    public boolean isAvailable(){
         return this.status == SeatStatus.AVAILABLE;
    }

    public int getSeatId() {
        return seatId;
    }

    public void book(){
        this.status = SeatStatus.BOOKED;
    }
}
