package CaseStudies.ParkingLot.Entity;

import CaseStudies.ParkingLot.ParkingArea.ParkingLevel;

public class Ticket {
    public Vehicle vehicle;
    public ParkingLevel parkingLevel;
    public ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, ParkingLevel parkingLevel, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.parkingLevel = parkingLevel;
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingLevel getParkingLevel() {
        return parkingLevel;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
