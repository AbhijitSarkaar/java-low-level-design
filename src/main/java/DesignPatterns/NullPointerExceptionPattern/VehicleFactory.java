package DesignPatterns.NullPointerExceptionPattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if(type.equals("car")) return new Car();
        else if(type.equals("bike")) return new Bike();
        else return new NullVehicle();
    }
}
