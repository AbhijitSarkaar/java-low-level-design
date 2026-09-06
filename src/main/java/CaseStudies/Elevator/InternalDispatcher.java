package CaseStudies.Elevator;

public class InternalDispatcher {
    public static InternalDispatcher INSTANCE = new InternalDispatcher();

    public InternalDispatcher() {}

    public static InternalDispatcher getInstance() {
        return INSTANCE;
    }

    public void submitRequest(int destinationFloor, ElevatorController controller) {
        controller.submitRequest(destinationFloor);
    }
}
