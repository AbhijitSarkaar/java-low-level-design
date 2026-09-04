package DesignPatterns.FactoryPattern.AbstractFactory;

public class EconomyExterior implements CarExterior {
    @Override
    public void addComponents() {
        System.out.println("EconomyExterior.addComponents()");
    }
}
