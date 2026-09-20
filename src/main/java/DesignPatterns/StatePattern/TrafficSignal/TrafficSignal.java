package DesignPatterns.StatePattern.TrafficSignal;

public class TrafficSignal {
    TrafficSignalState state;

    public TrafficSignal() {
        this.state = new RedState();
    }

    public void setState(TrafficSignalState state) {
        this.state = state;
    }

    public void changeState() {
        System.out.println("current state " + this.state.getClass());
        this.state.updateState(this);
    }
}
