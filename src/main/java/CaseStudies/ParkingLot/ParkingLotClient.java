package CaseStudies.ParkingLot;

import CaseStudies.ParkingLot.Entity.ParkingSpot;
import CaseStudies.ParkingLot.Entity.Ticket;
import CaseStudies.ParkingLot.Entity.Vehicle;
import CaseStudies.ParkingLot.Enums.VehicleType;
import CaseStudies.ParkingLot.LookUpStrategy.ParkingSpotLookUpStrategy;
import CaseStudies.ParkingLot.LookUpStrategy.RandomLookupStrategy;
import CaseStudies.ParkingLot.ParkingArea.*;
import CaseStudies.ParkingLot.Payment.CashPayment;
import CaseStudies.ParkingLot.Pricing.CostComputation;
import CaseStudies.ParkingLot.Pricing.FixedPricingStrategy;
import CaseStudies.ParkingLot.SpotManagers.ParkingSpotManager;
import CaseStudies.ParkingLot.SpotManagers.TwoWheelerSpotManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotClient {
    public static void main(String[] args) {

        ParkingSpotLookUpStrategy parkingSpotLookUpStrategy = new RandomLookupStrategy();
        Map<VehicleType, ParkingSpotManager> levelOneManagers = new HashMap<>();
        levelOneManagers.put(VehicleType.TWO_WHEELER,
                new TwoWheelerSpotManager(
                        List.of(new ParkingSpot("L1-S1"), new ParkingSpot("L1-S2")),
                        parkingSpotLookUpStrategy
                ));
        ParkingLevel parkingLevel = new ParkingLevel(1, levelOneManagers);

        ParkingBuilding parkingBuilding = new ParkingBuilding(
            List.of(parkingLevel)
        );

        ParkingLot parkingLot = new ParkingLot(
                parkingBuilding,
                new EntranceGate(),
                new ExitGate(new CostComputation(new FixedPricingStrategy()))
        );

        Vehicle bike = new Vehicle("Bike-101", VehicleType.TWO_WHEELER);
        Ticket t1 = parkingLot.vehicleArrives(bike);
        parkingLot.vehicleExits(t1, new CashPayment());

    }
}
