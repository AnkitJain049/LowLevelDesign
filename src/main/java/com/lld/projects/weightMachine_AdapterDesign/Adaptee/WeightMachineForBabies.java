package com.lld.projects.weightMachine_AdapterDesign.Adaptee;

public class WeightMachineForBabies implements WeightMachine {
    double wt;
    public WeightMachineForBabies(double wt){
        this.wt=wt;
    }
    @Override
    public double getWeightInPound(){
        return wt;
    }
}
