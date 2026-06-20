package com.lld.projects.weightMachine_AdapterDesign.Adapter;

import com.lld.projects.weightMachine_AdapterDesign.Adaptee.WeightMachine;

public class WeightMachineInKg implements WeightMachineAdapter {
    WeightMachine wm;  //has-a relationship between adapter and adaptee

    public WeightMachineInKg(WeightMachine wm) {
        this.wm = wm;
    }

    @Override
    public double getWeightInKg() {
        double pound = wm.getWeightInPound();
        return pound * 0.45;
    }
}
