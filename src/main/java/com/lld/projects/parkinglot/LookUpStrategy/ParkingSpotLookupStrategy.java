package com.lld.projects.parkinglot.LookUpStrategy;

import com.lld.projects.parkinglot.entity.ParkingSpot;

import java.util.List;

public interface ParkingSpotLookupStrategy {
    ParkingSpot selectSpot(List<ParkingSpot> spots);
}

