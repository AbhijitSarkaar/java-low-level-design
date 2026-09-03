package DesignPatterns.StrategyPattern;

public class SportsVehicle extends Vehicle {

    private final DriveStrategy driveStrategy;

    SportsVehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        // version 1
//        System.out.println("Sports drive");

        // version 2
//        System.out.println("Sports drive 2");

        this.driveStrategy.vehicleDrive();
    }
}
