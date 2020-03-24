package com.codecool.EnergeticDevelopment.model.consumers;

import com.codecool.EnergeticDevelopment.model.Consume;

public abstract class EnergyConsumers implements Consume {

    int requestEnergyPerDay;

    EnergyConsumers() {
    }

    @Override
    public void consume(int energy){

    }
}
