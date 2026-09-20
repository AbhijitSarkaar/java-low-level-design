package DesignPatterns.StatePattern.TrafficSignal;

public class RedState implements TrafficSignalState {
    @Override
    public void updateState(TrafficSignal trafficSignal) {
        trafficSignal.setState(new GreenState());
    }
}
