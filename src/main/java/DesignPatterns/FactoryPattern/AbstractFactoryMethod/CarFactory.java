package DesignPatterns.FactoryPattern.AbstractFactoryMethod;

public interface CarFactory {
    CarInterior carInterior();
    CarExterior carExterior();

    default void productCompleteVehicle() {
        CarInterior carInterior = carInterior();
        CarExterior carExterior = carExterior();

        carInterior.addComponents();
        carExterior.addComponents();
    }
}
