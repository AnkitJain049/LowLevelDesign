package com.lld.projects.elevatorSystem.Buttons;
import com.lld.projects.elevatorSystem.ElevatorController;
import com.lld.projects.elevatorSystem.ElevatorScheduler;
import com.lld.projects.elevatorSystem.enums.ElevatorDirection;

import java.util.List;

public class ExternalDispatcher {

    ElevatorScheduler scheduler;

    public ExternalDispatcher(ElevatorScheduler scheduler) {
        this.scheduler = scheduler;
    }

    public void submitExternalRequest(int floor, ElevatorDirection direction) {

        ElevatorController controller =
                scheduler.assignElevator(floor, direction);
        controller.submitRequest(floor);
    }

}