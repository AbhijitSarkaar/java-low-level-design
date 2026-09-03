package DesignPatterns.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        SportsDriveStrategy sportsDriveStrategy = new SportsDriveStrategy();
        NormalDriveStrategy normalDriveStrategy = new NormalDriveStrategy();

        Vehicle sportsVehicle = new SportsVehicle(sportsDriveStrategy);
        Vehicle offRoadVehicle = new OffRoadVehicle(sportsDriveStrategy);
        Vehicle passengerVehicle = new PassengerVehicle(normalDriveStrategy);
        Vehicle passengerVehicle2 = new PassengerVehicle(sportsDriveStrategy);

        sportsVehicle.drive();
        offRoadVehicle.drive();
        passengerVehicle.drive();
        passengerVehicle2.drive();
    }
}
