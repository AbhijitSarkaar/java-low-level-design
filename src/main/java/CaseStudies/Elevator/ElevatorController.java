package CaseStudies.Elevator;

import java.util.concurrent.PriorityBlockingQueue;

public class ElevatorController implements Runnable {
    public PriorityBlockingQueue<Integer> upMinPQ;
    public PriorityBlockingQueue<Integer> downMaxPQ;

    public ElevatorCar elevatorCar;

    private final Object monitor = new Object();

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityBlockingQueue<>();
        downMaxPQ = new PriorityBlockingQueue<>(10, (a,b) -> b-a);
    }

    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public void submitRequest(int destinationFloor) {
        enqueueRequest(destinationFloor);
    }

    private void enqueueRequest(int destinationFloor) {

        System.out.println("Request details -> destinationFloor: " + destinationFloor + " accepted by elevator " + elevatorCar.getId());

        if(destinationFloor == this.elevatorCar.getNextFloorStoppage()) {
            return;
        }
        if(destinationFloor >= this.elevatorCar.getNextFloorStoppage()) {
            if(!upMinPQ.contains(destinationFloor)) {
                upMinPQ.offer(destinationFloor);
            }
        }
        else if(destinationFloor <= this.elevatorCar.getNextFloorStoppage()) {
            if(!downMaxPQ.contains(destinationFloor)) {
                downMaxPQ.offer(destinationFloor);
            }
        }

        synchronized (monitor) {
            monitor.notify();
        }
    }

    @Override
    public void run() {
        controlElevator();
    }

    public void controlElevator() {

        while(true) {
            synchronized (monitor) {
                while(upMinPQ.isEmpty() && downMaxPQ.isEmpty()) {
                    try {
                        System.out.println("elevator: " + elevatorCar.getId() + " is idle");
                        elevatorCar.setMovingDirection(ElevatorDirection.IDLE);
                        monitor.wait();
                    } catch(InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }

            while(!upMinPQ.isEmpty()) {
                int floor = upMinPQ.poll();
                System.out.println("serving floor: " + floor + " by elevator: " + elevatorCar.getId() + " from floor: " + elevatorCar.getCurrentFloor());
                elevatorCar.moveElevator(floor);
            }

            while(!downMaxPQ.isEmpty()) {
                int floor = downMaxPQ.poll();
                System.out.println("serving floor: " + floor + " by elevator: " + elevatorCar.getId() + " from floor: " + elevatorCar.getCurrentFloor());
                elevatorCar.moveElevator(floor);
            }
        }
    }
}
