package com.codecool.EnergeticDevelopment.model.energyPlants;

public class FusionPlant extends EnergyPlant {

    public FusionPlant(){
        super();
        requestSupplies = 1;
        type = PlantType.FUSION_PLANT;
        producedEnergy = 20000;
    }


    @Override
    public boolean consume(int heliumUnit) {
        return heliumUnit > requestSupplies;
    }

    @Override
    public int producePerDay() {
        return producedEnergy;
    }
}
