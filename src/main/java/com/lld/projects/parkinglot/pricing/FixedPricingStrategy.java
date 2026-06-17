package com.lld.projects.parkinglot.pricing;

import com.lld.projects.parkinglot.Ticket;

public class FixedPricingStrategy implements PricingStrategy {

    @Override
    public double calculate(Ticket ticket) {
        return 100;
    }
}
