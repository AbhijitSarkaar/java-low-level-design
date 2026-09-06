package CaseStudies.Elevator;

import java.util.List;

public class ElevatorScheduler {
    private final List<ElevatorController> controllers;
    private ElevatorSelectionStrategy strategy;

    ElevatorScheduler(List<ElevatorController> controllers, ElevatorSelectionStrategy strategy) {
        this.controllers = controllers;
        this.strategy = strategy;
    }

    public ElevatorController assignElevator(int floor, ElevatorDirection elevatorDirection) {
        return this.strategy.selectElevator(controllers, floor, elevatorDirection);
    }
}
