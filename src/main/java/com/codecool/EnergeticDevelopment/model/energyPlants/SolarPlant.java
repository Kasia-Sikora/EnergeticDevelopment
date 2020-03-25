package com.codecool.EnergeticDevelopment.model.energyPlants;

public class SolarPlant extends EnergyPlant {


    public SolarPlant(){
        super();
        requestSupplies = 0;
        type = PlantType.SOLAR_PLANT;
        producedEnergy = 2;
    }

    @Override
    public boolean consume(int supplies) {
        return true;
    }

    @Override
    public int producePerDay() {
        return producedEnergy;
    }
}
