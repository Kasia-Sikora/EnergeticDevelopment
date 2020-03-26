package com.codecool.EnergeticDevelopment.controller;

import com.codecool.EnergeticDevelopment.model.Warehouse;
import com.codecool.EnergeticDevelopment.model.consumers.EnergyConsumers;
import com.codecool.EnergeticDevelopment.model.energyPlants.*;
import com.codecool.EnergeticDevelopment.model.mines.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class EnergeticSimulator {

    private Warehouse warehouse;
    private List<EnergyPlant> listOfEnergyPlants = new ArrayList<>();
    private List<Mines> listOfMines = new ArrayList<>();

    private int coalMines = 0;
    private int uraniumMine = 0;
    private int moonMine = 0;

    private int nuclearPlants = 0;
    private int coalPlants = 0;
    private int solarPlants = 1000;
    private int fusionPlants = 0;
    private int daysCircle = 5;


    private Map<PlantType, Integer> listOfPlantsQuantity = Map.of(
            PlantType.NUCLEAR_PLANT, nuclearPlants,
            PlantType.COAL_PLANT, coalPlants,
            PlantType.SOLAR_PLANT, solarPlants,
            PlantType.FUSION_PLANT, fusionPlants);

    private Map<MineTypes, Integer> listOfMinesQuantity = Map.of(
            MineTypes.COAL, coalMines,
            MineTypes.URANIUM, uraniumMine,
            MineTypes.HELIUM, moonMine);


    EnergeticSimulator(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    void generateEnergyPlants() {
        for (Map.Entry<PlantType, Integer> entry : listOfPlantsQuantity.entrySet()) {
            if (entry.getValue() > 0) {
                for (int i = 0; i < entry.getValue(); i++)
                    addPlantsToList(entry.getKey());
            }
        }
    }

    void generateMines() {
        for (Map.Entry<MineTypes, Integer> entry : listOfMinesQuantity.entrySet()) {
            if (entry.getValue() > 0) {
                for (int i = 0; i < entry.getValue(); i++)
                    addMinesToList(entry.getKey());
            }
        }
    }

    private void addMinesToList(MineTypes mineTypes) {
        switch (mineTypes) {
            case COAL:
                listOfMines.add(new CoalMine());
                break;
            case HELIUM:
                listOfMines.add(new MoonMine());
                break;
            case URANIUM:
                listOfMines.add(new UraniumMine());
        }

    }

    private void addPlantsToList(PlantType plantType) {
        switch (plantType) {
            case COAL_PLANT:
                listOfEnergyPlants.add(new CoalPlant());
                break;
            case SOLAR_PLANT:
                listOfEnergyPlants.add(new SolarPlant());
                break;
            case FUSION_PLANT:
                listOfEnergyPlants.add(new FusionPlant());
                break;
            case NUCLEAR_PLANT:
                listOfEnergyPlants.add(new NuclearPlant());
                break;
        }
    }

    void generateSuppliesOverDays() {
        for (int i = 0; i < daysCircle; i++) {
            for (Mines mine : listOfMines) {
                warehouse.setUnits(mine.getType(), mine.producePerDay());
            }
        }
    }

    void generateEnergyOverDays() {
        for (int i = 0; i < daysCircle; i++) {
            for (EnergyPlant plant : listOfEnergyPlants) {
                if (plant.consume(warehouse.getUnit(plant.getType()))) {
                    warehouse.setUnits(plant.getType(), -plant.getRequestSupplies());
                    warehouse.setEnergyUnits(plant.producePerDay());
                }
            }
        }
    }

    boolean powerTheConsumerOverDays(EnergyConsumers consumer) {
        for (int i = 0; i < daysCircle; i++) {
            if (consumer.consume(warehouse.getEnergyUnits())) {
                warehouse.setEnergyUnits(-consumer.getRequestEnergyPerDay());
            } else {
                return false;
            }
        }
        return true;
    }
}
