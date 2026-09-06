package CaseStudies.Elevator;

public class Door {
    public DoorState state;

    public void openDoor(Integer id) {
        System.out.println("Door open: Elevator " + id);
        state = DoorState.DOOR_OPEN;
    }

    public void closeDoor(Integer id) {
        System.out.println("Door closed: Elevator " + id);
        state = DoorState.DOOR_CLOSED;
    }
}
