package CaseStudies.Elevator;

public class ElevatorCar {
    public Integer id;
    public Integer currentFloor;
    public Integer nextFloorStoppage;
    public ElevatorDirection movingDirection;
    Door door;

    ElevatorCar(int id) {
        this.id = id;
        currentFloor = 0;
        nextFloorStoppage = 0;
        movingDirection = ElevatorDirection.IDLE;
        door = new Door();
    }

    public Integer getNextFloorStoppage() {
        return nextFloorStoppage;
    }

    public void showDisplay() {
        System.out.println("elevator: " + id + " current floor: " + currentFloor + " going " + movingDirection);
    }

    public void moveElevator(int destinationFloor) {
        this.nextFloorStoppage = destinationFloor;
        if(this.currentFloor == this.nextFloorStoppage) {
            door.openDoor(this.id);
            return;
        }

        int startFloor = this.currentFloor;
        door.closeDoor(this.id);
        if(nextFloorStoppage >= currentFloor) {
            movingDirection = ElevatorDirection.UP;
            showDisplay();
            for(int i = startFloor + 1; i <= nextFloorStoppage; ++i) {
                try {
                    Thread.sleep(5);
                } catch (Exception e) {}
                setCurrentFloor(i);
                showDisplay();
            }
        } else {
            movingDirection = ElevatorDirection.DOWN;
            showDisplay();
            for(int i = startFloor - 1; i >= nextFloorStoppage; --i) {
                try {
                    Thread.sleep(5);
                } catch (Exception e) {}
                setCurrentFloor(i);
                showDisplay();
            }
        }
        door.openDoor(id);

    }

    public ElevatorDirection getMovingDirection() {
        return movingDirection;
    }

    public Integer getCurrentFloor() {
        return currentFloor;
    }

    public Integer getId() {
        return id;
    }

    public void setCurrentFloor(Integer currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setMovingDirection(ElevatorDirection movingDirection) {
        this.movingDirection = movingDirection;
    }
}
