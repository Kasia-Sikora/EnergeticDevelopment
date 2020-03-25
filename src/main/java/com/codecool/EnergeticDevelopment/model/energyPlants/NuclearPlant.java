package com.codecool.EnergeticDevelopment.model.energyPlants;

public class NuclearPlant extends EnergyPlant {


    public NuclearPlant(){
        super();
        requestSupplies = 1;
        type = PlantType.NUCLEAR_PLANT;
        producedEnergy = 10000;
    }

    @Override
    public boolean consume(int uraniumUnit) {
        return uraniumUnit > requestSupplies;
    }

    @Override
    public int producePerDay() {
        return producedEnergy;
    }
}
