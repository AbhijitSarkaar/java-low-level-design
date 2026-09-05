package CaseStudies.ParkingLot.ParkingArea;

import CaseStudies.ParkingLot.Entity.ParkingSpot;
import CaseStudies.ParkingLot.Entity.Ticket;
import CaseStudies.ParkingLot.Entity.Vehicle;

import java.util.List;

public class ParkingBuilding {
    private final List<ParkingLevel> parkingLevels;

    public ParkingBuilding(List<ParkingLevel> levels) {
        this.parkingLevels = levels;
    }

    Ticket allocate(Vehicle vehicle) {
        for(ParkingLevel parkingLevel: parkingLevels) {
            if(parkingLevel.hasAvailability(vehicle.getVehicleType())) {
                ParkingSpot spot = parkingLevel.park(vehicle.getVehicleType());
                if(spot != null) {
                    return new Ticket(vehicle, parkingLevel, spot);
                }
            }
        }
        throw new RuntimeException("Parking full");
    }

    void release(Ticket ticket) {
//        ticket.getParkingSpot().releaseSpot();

        // concurrency
        ticket.getParkingLevel().unpark(
                ticket.getVehicle().getVehicleType(),
                ticket.getParkingSpot()
        );
    }

}
