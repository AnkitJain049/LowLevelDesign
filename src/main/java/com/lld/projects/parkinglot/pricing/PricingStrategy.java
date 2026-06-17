package com.lld.projects.parkinglot.pricing;

import com.lld.projects.parkinglot.Ticket;

public interface PricingStrategy {

    double calculate(Ticket ticket);
}
