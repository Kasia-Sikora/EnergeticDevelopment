package com.codecool.EnergeticDevelopment.model.energyPlants;

public class FusionPlant extends EnergyPlant {

    FusionPlant(){
        super();
        requestSupplies = 1;
    }


    @Override
    public void consume(int supplies) {
    }

    @Override
    public int producePerDay() {
        return 0;
    }
}
