package DesignPatterns.CommandPattern;

public class RemoteController {
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    void pressButton() {
        command.execute();
    }
}
