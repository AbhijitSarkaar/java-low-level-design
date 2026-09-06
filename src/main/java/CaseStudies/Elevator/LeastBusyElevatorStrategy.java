package CaseStudies.Elevator;

import java.util.List;

public class LeastBusyElevatorStrategy implements ElevatorSelectionStrategy {
    @Override
    public ElevatorController selectElevator(List<ElevatorController> controllers, int requestFloor, ElevatorDirection direction) {
        ElevatorController best = null;
        int minLoad = Integer.MAX_VALUE;

        for(ElevatorController controller: controllers) {
            int load = controller.downMaxPQ.size() + controller.upMinPQ.size();
            if(load < minLoad) {
                minLoad = load;
                best = controller;
            }
        }
        return best;
    }
}
