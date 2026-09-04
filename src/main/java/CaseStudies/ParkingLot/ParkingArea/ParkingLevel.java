package CaseStudies.ParkingLot.ParkingArea;

import CaseStudies.ParkingLot.Entity.ParkingSpot;
import CaseStudies.ParkingLot.Enums.VehicleType;
import CaseStudies.ParkingLot.SpotManagers.ParkingSpotManager;

import java.util.Map;

public class ParkingLevel {

    private final int levelNumber;
    private final Map<VehicleType, ParkingSpotManager> managers;

    public ParkingLevel(int levelNumber, Map<VehicleType, ParkingSpotManager> managers) {
        this.levelNumber = levelNumber;
        this.managers = managers;
    }

    public boolean hasAvailability(VehicleType vehicleType) {
        ParkingSpotManager manager = managers.get(vehicleType);
        return manager != null && manager.hasFreeSpot();
    }

    public ParkingSpot park(VehicleType vehicleType) {
        ParkingSpotManager manager = managers.get(vehicleType);
        return manager.park();
    }

    public void unpark(VehicleType vehicleType, ParkingSpot spot) {
        ParkingSpotManager manager = managers.get(vehicleType);
        manager.unpark(spot);
    }

    public int getLevelNumber() {
        return levelNumber;
    }
}
