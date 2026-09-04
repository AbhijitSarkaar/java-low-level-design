package CaseStudies.ParkingLot.ParkingArea;

import CaseStudies.ParkingLot.Entity.Ticket;
import CaseStudies.ParkingLot.Entity.Vehicle;
import CaseStudies.ParkingLot.Payment.Payment;

public class ParkingLot {
    private ParkingBuilding parkingBuilding;
    private EntranceGate entranceGate;
    private ExitGate exitGate;

    public ParkingLot(ParkingBuilding parkingBuilding, EntranceGate entranceGate, ExitGate exitGate) {
        this.parkingBuilding = parkingBuilding;
        this.entranceGate = entranceGate;
        this.exitGate = exitGate;
    }

    public Ticket vehicleArrives(Vehicle vehicle) {
        return this.entranceGate.enter(this.parkingBuilding, vehicle);
    }

    public void vehicleExits(Ticket ticket, Payment payment) {
        this.exitGate.completeExit(parkingBuilding, ticket, payment);
    }

}
