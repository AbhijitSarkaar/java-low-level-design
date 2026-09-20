package DesignPatterns.StatePattern.TrafficSignal;

public class Main {
    public static void main(String[] args) {
        TrafficSignal trafficSignal = new TrafficSignal();

        trafficSignal.changeState();
        trafficSignal.changeState();
        trafficSignal.changeState();
        trafficSignal.changeState();
    }
}
