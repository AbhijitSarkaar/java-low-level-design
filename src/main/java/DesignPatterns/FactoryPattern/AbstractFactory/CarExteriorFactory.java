package DesignPatterns.FactoryPattern.AbstractFactory;

public class CarExteriorFactory {
    public CarExterior getExterior(String type) {
        if(type == "economy") {
            return new EconomyExterior();
        }
        else if(type == "luxury") {
            return new LuxuryExterior();
        }
        else {
            return null;
        }
    }
}
