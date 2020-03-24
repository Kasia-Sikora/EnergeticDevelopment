package com.codecool.EnergeticDevelopment.model.energyPlants;

public class SolarPlant extends EnergyPlant {


    SolarPlant(){
        super();
        requestSupplies = 0;
    }

    @Override
    public void consume(int supplies) {
    }

    @Override
    public int producePerDay() {
        return 0;
    }
}
