package com.codecool.EnergeticDevelopment.model.energyPlants;

import com.codecool.EnergeticDevelopment.model.Consume;
import com.codecool.EnergeticDevelopment.model.Produce;

public abstract class EnergyPlant implements Consume, Produce {

    int producedEnergy;
    int requestSupplies;

    EnergyPlant() {

    }
}
