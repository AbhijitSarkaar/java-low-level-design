package DesignPatterns.FactoryPattern.AbstractFactory;

public class CarInteriorFactory {
    public CarInterior getInterior(String type) {
        if(type == "economy") {
            return new EconomyInterior();
        }
        else if(type == "luxury") {
            return new LuxuryInterior();
        }
        else {
            return null;
        }
    }
}
