package com.codecool.EnergeticDevelopment.model.consumers;

import com.codecool.EnergeticDevelopment.model.Consume;

public abstract class EnergyConsumers implements Consume {

    int requestEnergyPerDay;

    EnergyConsumers() {
    }

    @Override
    public boolean consume(int energy){
        return requestEnergyPerDay < energy;
    }

    public int getRequestEnergyPerDay(){
        return requestEnergyPerDay;
    }
}
