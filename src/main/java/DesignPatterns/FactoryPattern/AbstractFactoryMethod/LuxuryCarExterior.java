package DesignPatterns.FactoryPattern.AbstractFactoryMethod;

public class LuxuryCarExterior implements CarExterior {
    @Override
    public void addComponents() {
        System.out.println("LuxuryCarExterior.addComponents()");
    }
}
