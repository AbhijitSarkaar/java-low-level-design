package CaseStudies.Elevator;

public class Floor {
    int floorNumber;
    public ExternalButton upButton;
    public ExternalButton downButton;

    public Floor(int floorNumber, ExternalDispatcher externalDispatcher) {
        this.floorNumber = floorNumber;
        this.upButton = new ExternalButton(externalDispatcher);
        this.downButton = new ExternalButton(externalDispatcher);
    }

    public void pressUpButton() {
        this.upButton.pressButton(floorNumber, ElevatorDirection.UP);
    }

    public void pressDownButton() {
        this.downButton.pressButton(floorNumber, ElevatorDirection.DOWN);
    }

}
