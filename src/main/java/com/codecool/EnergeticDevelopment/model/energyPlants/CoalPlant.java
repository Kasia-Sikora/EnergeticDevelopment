package com.codecool.EnergeticDevelopment.model.energyPlants;

public class CoalPlant extends EnergyPlant {

    CoalPlant() {
        super();
        requestSupplies = 100;
    }

    @Override
    public void consume(int coalUnits) {
        if(coalUnits > requestSupplies)
            producePerDay();
    }

    @Override
    public int producePerDay() {
        return producedEnergy;
    }
}
