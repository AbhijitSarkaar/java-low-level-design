package CaseStudies.ParkingLot.SpotManagers;

import CaseStudies.ParkingLot.Entity.ParkingSpot;
import CaseStudies.ParkingLot.Entity.Vehicle;
import CaseStudies.ParkingLot.Enums.VehicleType;
import CaseStudies.ParkingLot.LookUpStrategy.ParkingSpotLookUpStrategy;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public abstract class ParkingSpotManager {
    protected final List<ParkingSpot> spots;
    protected ParkingSpotLookUpStrategy strategy;
    private ReentrantLock lock = new ReentrantLock(true);

    protected ParkingSpotManager(List<ParkingSpot> spots, ParkingSpotLookUpStrategy strategy) {
        this.spots = spots;
        this.strategy = strategy;
    }

    public ParkingSpot park() {
        lock.lock();
        try {
            ParkingSpot spot = strategy.selectSpot(spots);
            if(spot == null) {
                return null;
            }
            spot.occupySpot();
            return spot;
        } finally {
            lock.unlock();
        }
    }

    public boolean hasFreeSpot() {
        lock.lock();
        try {
            for(ParkingSpot spot: spots) {
                if(spot.isSpotFree()) return true;
            }
            return false;
        }
        finally {
            lock.unlock();
        }

    }

    public void unpark(ParkingSpot spot) {
        lock.lock();
        try {
            spot.releaseSpot();
        }
        finally {
            lock.unlock();
        }
    }
}
