package DesignPatterns.FactoryPattern.AbstractFactoryMethod;

public class Main {
    public static void main(String[] args) {
        EconomyCarFactory economyCarFactory = (EconomyCarFactory) CarFactoryProvider.getCarFactory(CarType.ECONOMY);
        EconomyCarInterior economyCarInterior = (EconomyCarInterior) economyCarFactory.carInterior();
        EconomyCarExterior economyCarExterior = (EconomyCarExterior) economyCarFactory.carExterior();
        economyCarInterior.addComponents();
        economyCarExterior.addComponents();


    }
}
