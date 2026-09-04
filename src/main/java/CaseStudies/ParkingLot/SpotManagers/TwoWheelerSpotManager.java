package CaseStudies.ParkingLot.SpotManagers;

import CaseStudies.ParkingLot.Entity.ParkingSpot;
import CaseStudies.ParkingLot.LookUpStrategy.ParkingSpotLookUpStrategy;

import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager {
    public TwoWheelerSpotManager(List<ParkingSpot> spots, ParkingSpotLookUpStrategy strategy) {
        super(spots, strategy);
    }
}
