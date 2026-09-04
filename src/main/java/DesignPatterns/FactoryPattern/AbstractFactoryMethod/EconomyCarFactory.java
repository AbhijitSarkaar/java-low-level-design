package DesignPatterns.FactoryPattern.AbstractFactoryMethod;

public class EconomyCarFactory implements CarFactory {
    @Override
    public CarInterior carInterior() {
        return new EconomyCarInterior();
    }

    @Override
    public CarExterior carExterior() {
        return new EconomyCarExterior();
    }
}
