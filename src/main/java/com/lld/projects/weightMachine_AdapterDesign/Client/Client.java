package com.lld.projects.weightMachine_AdapterDesign.Client;

import com.lld.projects.weightMachine_AdapterDesign.Adaptee.WeightMachineForBabies;
import com.lld.projects.weightMachine_AdapterDesign.Adapter.WeightMachineAdapter;
import com.lld.projects.weightMachine_AdapterDesign.Adapter.WeightMachineInKg;

public class Client {
    public static void main(String[] args) {
        System.out.println("======= Adapter Design Pattern ======");

        // ImperialWeighingMachine - // Existing weighing machine is used to weigh the baby in pounds
        double weight = 100.0; // say the baby's weight is 25 pounds
        WeightMachineForBabies pounds = new WeightMachineForBabies(weight);

        // Adapter to convert to KG
        WeightMachineAdapter weightMachineAdapter = new WeightMachineInKg(pounds);

        // Client gets weight in Kilograms
        System.out.println("Weight in KG: " + weightMachineAdapter.getWeightInKg());
    }
}
