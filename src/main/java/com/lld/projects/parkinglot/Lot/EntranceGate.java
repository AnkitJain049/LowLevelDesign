package com.lld.projects.parkinglot.Lot;

import com.lld.projects.parkinglot.Ticket;
import com.lld.projects.parkinglot.entity.Vehicle;

public class EntranceGate {

    public Ticket enter(ParkingBuilding building, Vehicle vehicle) {
        return building.allocate(vehicle);
    }
}