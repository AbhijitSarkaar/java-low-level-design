package DesignPatterns.StrategyPattern;

public class OffRoadVehicle extends Vehicle {

    public final DriveStrategy driveStrategy;

    OffRoadVehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        // version 1
//        System.out.println("sports drive");

        // version 2
//        System.out.println("sports drive");

        this.driveStrategy.vehicleDrive();
    }
}
