package com.lld.projects.elevatorSystem;

import com.lld.projects.elevatorSystem.Strategy.ElevatorSelectionStrategy;
import com.lld.projects.elevatorSystem.enums.ElevatorDirection;

import java.util.List;

public class ElevatorScheduler {

    private final List<ElevatorController> controllers;
    private ElevatorSelectionStrategy strategy;

    public ElevatorScheduler(List<ElevatorController> controllers,
                             ElevatorSelectionStrategy strategy) {
        this.controllers = controllers;
        this.strategy = strategy;
    }

    public void setStrategy(ElevatorSelectionStrategy strategy) {
        this.strategy = strategy;
    }

    public ElevatorController assignElevator(int floor, ElevatorDirection direction) {
        return strategy.selectElevator(controllers, floor, direction);
    }
}