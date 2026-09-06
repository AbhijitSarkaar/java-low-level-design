package CaseStudies.Elevator;

public class InternalButton {
    private final ElevatorController controller;

    public InternalButton(ElevatorController controller) {
        this.controller = controller;
    }

    public void pressButton(int floor) {
        InternalDispatcher.getInstance().submitRequest(floor, controller);
    }
}
