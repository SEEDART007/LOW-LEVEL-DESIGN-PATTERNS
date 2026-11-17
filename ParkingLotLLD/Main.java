package ParkingLotLLD;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Level level = new Level(1);
        level.addSpot(new ParkingSpot(101,ParkingSpotType.BIKE));
        level.addSpot(new ParkingSpot(102,ParkingSpotType.CAR));
        level.addSpot(new ParkingSpot(103,ParkingSpotType.TRUCK));
        parkingLot.addLevel(level);

        Vehicle bike = new Bike("UP88945");
        Vehicle car = new Car("CAR55478");
        Vehicle truck = new Truck("TRUCK8890");

        Ticket t1 = parkingLot.parkVehicle(bike);
        System.out.println("Bike parked: Ticket id : "+t1.getTicketId()+": "+t1.getParkingSpot().getSpotId());
        Ticket t2 = parkingLot.parkVehicle(car);
        System.out.println("Car parked: Ticket id : "+t2.getTicketId()+": "+t2.getParkingSpot().getSpotId());

    }
}
