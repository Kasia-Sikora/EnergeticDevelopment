package com.codecool.EnergeticDevelopment.model.energyPlants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnergyPlantTest {

    @Test
    void Test_Constructor() {
        EnergyPlant energyPlant = new CoalPlant();
        assertEquals(PlantType.COAL_PLANT, energyPlant.getType());
    }
}