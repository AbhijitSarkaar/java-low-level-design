package DesignPatterns.CommandPattern;

public class AirConditioner {
    boolean acOn = false;
    int temperature;

    void turnAcOn() {
        acOn = true;
        System.out.println("AirConditioner.turnAcOn()");
    }

    void turnAcOff() {
        acOn = false;
        System.out.println("AirConditioner.turnAcOff()");
    }

    void setTemperature(int value) {
        temperature = value;
    }
}
