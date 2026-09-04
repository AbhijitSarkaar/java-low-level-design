package CaseStudies.ParkingLot.LookUpStrategy;

import CaseStudies.ParkingLot.Entity.ParkingSpot;

import java.util.List;

public interface ParkingSpotLookUpStrategy {
    public ParkingSpot selectSpot(List<ParkingSpot> spots);
}
