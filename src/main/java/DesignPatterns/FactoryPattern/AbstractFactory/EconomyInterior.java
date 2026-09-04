package DesignPatterns.FactoryPattern.AbstractFactory;

public class EconomyInterior implements CarInterior {
    @Override
    public void addComponents() {
        System.out.println("EconomyInterior.addComponents()");
    }
}
