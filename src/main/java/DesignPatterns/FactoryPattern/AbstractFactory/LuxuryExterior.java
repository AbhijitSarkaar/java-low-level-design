package DesignPatterns.FactoryPattern.AbstractFactory;

public class LuxuryExterior implements CarExterior {
    @Override
    public void addComponents() {
        System.out.println("LuxuryExterior.addComponents()");
    }
}
