package com.codecool.EnergeticDevelopment.controller;

import com.codecool.EnergeticDevelopment.model.Warehouse;
import com.codecool.EnergeticDevelopment.model.consumers.EnergyConsumers;
import com.codecool.EnergeticDevelopment.model.consumers.NewYork;

public class Main {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        EnergyConsumers consumer = new NewYork();
        EnergeticSimulator energeticSimulator = new EnergeticSimulator(warehouse);

        energeticSimulator.generateEnergyPlants();
        energeticSimulator.generateMines();
        energeticSimulator.generateSuppliesOverDays();
        energeticSimulator.generateEnergyOverDays();
        boolean isEnergyEnoughForConsumer = energeticSimulator.powerTheConsumerOverDays(consumer);

        System.out.println(isEnergyEnoughForConsumer + " " + warehouse.getCoalUnits() + " " + warehouse.getHeliumUnits() + " " + warehouse.getUraniumUnits() + " " + warehouse.getEnergyUnits());
    }
}
