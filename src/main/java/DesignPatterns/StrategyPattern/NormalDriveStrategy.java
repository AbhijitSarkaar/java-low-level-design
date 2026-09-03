package DesignPatterns.StrategyPattern;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void vehicleDrive() {
        System.out.println("NormalDriveStrategy.vehicleDrive()");
    }
}
