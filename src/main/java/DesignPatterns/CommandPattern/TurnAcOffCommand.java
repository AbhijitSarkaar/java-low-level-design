package DesignPatterns.CommandPattern;

public class TurnAcOffCommand implements ICommand {

    AirConditioner airConditioner;

    public TurnAcOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnAcOff();
    }

    @Override
    public void undo() {
        airConditioner.turnAcOn();
    }
}
