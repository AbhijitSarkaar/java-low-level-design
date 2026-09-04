package DesignPatterns.FactoryPattern.AbstractFactoryMethod;

public class EconomyCarInterior implements CarInterior {
    @Override
    public void addComponents() {
        System.out.println("EconomyCarInterior.addComponents()");
    }
}
