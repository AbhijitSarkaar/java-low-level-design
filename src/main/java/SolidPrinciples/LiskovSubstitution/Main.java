package SolidPrinciples.LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Bike motorBike = new MotorCycle();
        Bike cycle = new Bicycle();

        motorBike.accelerate();
        motorBike.applyBrakes();

        cycle.accelerate();
        cycle.applyBrakes();

        Bicycle bicycle = new Bicycle();
        MotorCycle motorCycle = new MotorCycle();

        bicycle.accelerate();
        bicycle.applyBrakes();

        motorCycle.turnOnEngine();
        motorCycle.turnOffEngine();
        motorCycle.accelerate();
        motorCycle.applyBrakes();
    }
}
