package DesignPatterns.BridgePattern;

public class WaterBreathImplementation implements BreatheImplementor {
    @Override
    public void breath() {
        System.out.println("WaterBreathImplementation.breath()");
    }
}
