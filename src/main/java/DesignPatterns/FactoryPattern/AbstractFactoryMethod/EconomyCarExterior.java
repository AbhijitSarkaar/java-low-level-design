package DesignPatterns.FactoryPattern.AbstractFactoryMethod;

public class EconomyCarExterior implements CarExterior  {
    @Override
    public void addComponents() {
        System.out.println("EconomyCarExterior.addComponents()");
    }
}
