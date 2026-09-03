package DesignPatterns.StrategyPattern;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void vehicleDrive() {
        System.out.println("SportsDriveStrategy.vehicleDrive()");
    }
}
