package DesignPatterns.FactoryPattern.AbstractFactoryMethod;

public class LuxuryCarInterior implements CarInterior {
    @Override
    public void addComponents() {
        System.out.println("LuxuryCarInterior.addComponents()");
    }
}
