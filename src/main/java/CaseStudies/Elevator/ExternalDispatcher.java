package CaseStudies.Elevator;

public class ExternalDispatcher {
    ElevatorScheduler elevatorScheduler;

    public ExternalDispatcher(ElevatorScheduler elevatorScheduler) {
        this.elevatorScheduler = elevatorScheduler;
    }

    public void submitExternalRequest(int floor, ElevatorDirection elevatorDirection) {
        ElevatorController controller = this.elevatorScheduler.assignElevator(floor, elevatorDirection);
        controller.submitRequest(floor);
    }
}
