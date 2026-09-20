package DesignPatterns.StatePattern.TrafficSignal;

public class YellowState implements TrafficSignalState {
    @Override
    public void updateState(TrafficSignal trafficSignal) {
        trafficSignal.setState(new RedState());
    }
}
