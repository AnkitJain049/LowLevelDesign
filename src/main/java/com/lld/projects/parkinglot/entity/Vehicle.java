package com.lld.projects.parkinglot.entity;

import com.lld.projects.parkinglot.enums.VehicleType;

public class Vehicle {
    String vehicleNumber;
    VehicleType vehicleType;

    public Vehicle(String number,VehicleType vt){
        vehicleNumber=number;
        vehicleType=vt;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
