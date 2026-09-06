package CaseStudies.Elevator;

public class ExternalButton {
    private final ExternalDispatcher externalDispatcher;

    public ExternalButton(ExternalDispatcher externalDispatcher) {
        this.externalDispatcher = externalDispatcher;
    }

    public void pressButton(int floor, ElevatorDirection elevatorDirection) {
        this.externalDispatcher.submitExternalRequest(floor, elevatorDirection);
    }
}
