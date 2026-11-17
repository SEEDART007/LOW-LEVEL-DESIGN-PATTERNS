package ParkingLotLLD;

import java.time.LocalDateTime;

public class Ticket {
    int ticketId;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    LocalDateTime entryTime;

    static int counter=0;

    public Ticket(Vehicle vehicle,ParkingSpot parkingSpot) {
        this.ticketId = ++counter;
        this.vehicle=vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();
    }

    public int getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public static int getCounter() {
        return counter;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public static void setCounter(int counter) {
        Ticket.counter = counter;
    }
}
