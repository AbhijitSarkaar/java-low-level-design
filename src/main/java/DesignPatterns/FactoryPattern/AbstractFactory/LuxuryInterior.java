package DesignPatterns.FactoryPattern.AbstractFactory;

public class LuxuryInterior implements CarInterior {
    @Override
    public void addComponents() {
        System.out.println("LuxuryInterior.addComponents()");
    }
}
