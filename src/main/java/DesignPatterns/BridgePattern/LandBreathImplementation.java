package DesignPatterns.BridgePattern;

public class LandBreathImplementation implements BreatheImplementor {
    @Override
    public void breath() {
        System.out.println("LandBreathImplementation.breath()");
    }
}
