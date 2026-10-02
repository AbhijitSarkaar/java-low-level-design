package DesignPatterns.CommandPattern;

public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(new TurnAcOnCommand(new AirConditioner()));
        remoteController.pressButton();

        remoteController = new RemoteController();
        remoteController.setCommand(new TurnAcOffCommand(new AirConditioner()));
        remoteController.pressButton();
    }
}
