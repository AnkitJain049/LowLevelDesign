package com.lld.projects.elevatorSystem.Strategy;

import com.lld.projects.elevatorSystem.ElevatorController;
import com.lld.projects.elevatorSystem.enums.ElevatorDirection;

import java.util.List;

public class LeastBusyStrategy implements ElevatorSelectionStrategy {

    @Override
    public ElevatorController selectElevator(List<ElevatorController> controllers,
                                             int requestFloor,
                                             ElevatorDirection direction) {

        ElevatorController best = null;
        int minLoad = Integer.MAX_VALUE;

        for (ElevatorController controller : controllers) {
            int load = controller.upMinPQ.size() +
                    controller.downMaxPQ.size();

            if (load < minLoad) {
                minLoad = load;
                best = controller;
            }
        }
        return best;
    }
}
