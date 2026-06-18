package com.lld.projects.elevatorSystem.Strategy;

import com.lld.projects.elevatorSystem.ElevatorController;
import com.lld.projects.elevatorSystem.enums.ElevatorDirection;

import java.util.List;

public interface ElevatorSelectionStrategy {

    ElevatorController selectElevator(List<ElevatorController> controllers,
                                      int requestFloor,
                                      ElevatorDirection direction);
}