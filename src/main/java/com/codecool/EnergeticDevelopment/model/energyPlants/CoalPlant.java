package com.codecool.EnergeticDevelopment.model.energyPlants;

public class CoalPlant extends EnergyPlant {

    public CoalPlant() {
        super();
        requestSupplies = 100;
        type = PlantType.COAL_PLANT;
        producedEnergy = 7;
    }

    @Override
    public boolean consume(int coalUnits) {
        return coalUnits > requestSupplies;
    }

    @Override
    public int producePerDay() {
        return producedEnergy;
    }
}
