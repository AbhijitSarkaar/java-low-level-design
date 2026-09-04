package DesignPatterns.FactoryPattern.AbstractFactoryMethod;

public class CarFactoryProvider {
    public static CarFactory getCarFactory(CarType carType) {
        if(carType == CarType.ECONOMY) {
            return new EconomyCarFactory();
        }
        else if(carType == CarType.LUXURY) {
            return new LuxuryCarFactory();
        }
        else {
            return null;
        }
    }
}
