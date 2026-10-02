package DesignPatterns.CommandPattern;

public class TurnAcOnCommand implements ICommand {

    AirConditioner airConditioner;

    public TurnAcOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnAcOn();
    }

    @Override
    public void undo() {
        airConditioner.turnAcOff();
    }
}
