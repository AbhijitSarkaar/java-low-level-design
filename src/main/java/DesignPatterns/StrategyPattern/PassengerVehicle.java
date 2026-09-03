package DesignPatterns.StrategyPattern;

public class PassengerVehicle extends Vehicle {

    private final DriveStrategy driveStrategy;

    PassengerVehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    @Override
    public void drive() {
        // version 1
//        System.out.println("normal drive");

        // version 2
//        System.out.println("normal drive 2");

        this.driveStrategy.vehicleDrive();
    }
}
