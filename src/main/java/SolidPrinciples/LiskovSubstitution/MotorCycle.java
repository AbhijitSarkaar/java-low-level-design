package SolidPrinciples.LiskovSubstitution;

public class MotorCycle extends Bike implements Engine {
    @Override
    public void turnOnEngine() {
        System.out.println("MotorCycle.turnOnEngine()");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("MotorCycle.turnOffEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("MotorCycle.accelerate()");
    }

    @Override
    public void applyBrakes() {
        System.out.println("MotorCycle.applyBrakes()");
    }
}
