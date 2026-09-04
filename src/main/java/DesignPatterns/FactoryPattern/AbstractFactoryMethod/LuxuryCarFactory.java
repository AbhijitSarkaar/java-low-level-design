package DesignPatterns.FactoryPattern.AbstractFactoryMethod;

public class LuxuryCarFactory implements CarFactory {
    @Override
    public CarInterior carInterior() {
        return new LuxuryCarInterior();
    }

    @Override
    public CarExterior carExterior() {
        return new LuxuryCarExterior();
    }
}
