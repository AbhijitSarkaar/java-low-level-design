package DesignPatterns.NullPointerExceptionPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle truck = VehicleFactory.getVehicle("truck");
        truck.start();
    }
}
