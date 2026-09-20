package DesignPatterns.StatePattern.TrafficSignal;

public class GreenState implements TrafficSignalState {
    @Override
    public void updateState(TrafficSignal trafficSignal) {
        trafficSignal.setState(new YellowState());
    }
}
