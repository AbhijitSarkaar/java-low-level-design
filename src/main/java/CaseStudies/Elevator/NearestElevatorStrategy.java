package CaseStudies.Elevator;

import java.util.List;

public class NearestElevatorStrategy implements ElevatorSelectionStrategy {
    @Override
    public ElevatorController selectElevator(List<ElevatorController> controllers, int requestFloor, ElevatorDirection direction) {
        ElevatorController best = null;
        int minDistance = Integer.MAX_VALUE;

        for(ElevatorController controller: controllers) {
            int nextFloorStoppage = controller.getElevatorCar().getNextFloorStoppage();
            boolean sameDirectionCandidate = (controller.getElevatorCar().getMovingDirection() == direction)
                    && ((ElevatorDirection.UP == direction && nextFloorStoppage <= requestFloor) ||
                    (ElevatorDirection.DOWN == direction && nextFloorStoppage >= requestFloor));

            int dist = Math.abs(nextFloorStoppage - requestFloor);

            if(sameDirectionCandidate && dist < minDistance) {
                minDistance = dist;
                best = controller;
            }
        }

        if(best == null) {
            for(ElevatorController controller: controllers) {
                if(controller.getElevatorCar().getMovingDirection() == ElevatorDirection.IDLE) {
                    best = controller;
                    break;
                }
            }
            if(best == null) {
                best = controllers.get(0);
            }
        }

        return best;
    }
}