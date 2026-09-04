package CaseStudies.ParkingLot.ParkingArea;

import CaseStudies.ParkingLot.Entity.Ticket;
import CaseStudies.ParkingLot.Entity.Vehicle;

public class EntranceGate {
    public Ticket enter(ParkingBuilding parkingBuilding, Vehicle vehicle) {
        return parkingBuilding.allocate(vehicle);
    }
}
