package DesignPatterns.FactoryPattern.AbstractFactory;

public class Main {
    public static void main(String[] args) {

        CarInteriorFactory carInteriorFactory = (CarInteriorFactory) CarFactoryProducer.getCarFactory("interior");
        CarInterior economyInterior = carInteriorFactory.getInterior("economy");
        CarInterior luxuryInterior = carInteriorFactory.getInterior("luxury");
        economyInterior.addComponents();
        luxuryInterior.addComponents();

        CarExteriorFactory carExteriorFactory = (CarExteriorFactory) CarFactoryProducer.getCarFactory("exterior");
        CarExterior economyExterior = carExteriorFactory.getExterior("economy");
        CarExterior luxuryExterior = carExteriorFactory.getExterior("luxury");
        economyExterior.addComponents();
        luxuryExterior.addComponents();

    }
}
