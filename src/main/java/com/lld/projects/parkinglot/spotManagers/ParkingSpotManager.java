package com.lld.projects.parkinglot.spotManagers;

import com.lld.projects.parkinglot.LookUpStrategy.ParkingSpotLookupStrategy;
import com.lld.projects.parkinglot.entity.ParkingSpot;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public abstract class ParkingSpotManager {

    protected final List<ParkingSpot> spots;
    protected final ParkingSpotLookupStrategy strategy;
    private final ReentrantLock lock = new ReentrantLock(true);

    protected ParkingSpotManager(List<ParkingSpot> spots,ParkingSpotLookupStrategy strategy) {
        this.spots = spots;
        this.strategy = strategy;
    }

    public ParkingSpot park() {
        lock.lock();
        try {
            ParkingSpot spot = strategy.selectSpot(spots);
            if (spot == null) {
                return null;
            }

            spot.occupySpot();
            return spot;
        } finally {
            lock.unlock();
        }
    }

    public void unPark(ParkingSpot spot) {
        lock.lock();
        try {
            spot.releaseSpot();
        } finally {
            lock.unlock();
        }
    }

    public boolean hasFreeSpot() {
        lock.lock();
        try {
            return spots.stream().anyMatch(ParkingSpot::isSpotFree);
        } finally {
            lock.unlock();
        }
    }
}

