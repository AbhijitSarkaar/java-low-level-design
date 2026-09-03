package SolidPrinciples.LiskovSubstitution;

public class Bicycle extends Bike {
    @Override
    public void accelerate() {
        System.out.println("Bicycle.accelarate()");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Bicycle.applyBrakes()");
    }
}
