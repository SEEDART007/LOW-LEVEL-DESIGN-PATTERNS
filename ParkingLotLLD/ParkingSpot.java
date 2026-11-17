package ParkingLotLLD;

public class ParkingSpot {
    int spotId;
    ParkingSpotType spotType;
    boolean isOccupied;
    Vehicle vehicle;

    public ParkingSpot(int spotId,ParkingSpotType spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.isOccupied = false;
        this.vehicle=null;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public boolean canFitVehicle(Vehicle vehicle){
        if(spotType.name().equalsIgnoreCase(vehicle.vehicleType.name()) && !isOccupied){
            return true;
        }
        return false;
    }

    public void assignVehicle(Vehicle vehicle){
        this.isOccupied = true;
        this.vehicle=vehicle;
    }
    public void removeVehicle(Vehicle vehicle){
        this.isOccupied=false;
        this.vehicle = null;
    }
}
