package com.codecool.EnergeticDevelopment.model;

import com.codecool.EnergeticDevelopment.model.energyPlants.EnergyPlant;
import com.codecool.EnergeticDevelopment.model.energyPlants.PlantType;
import com.codecool.EnergeticDevelopment.model.mines.MineTypes;

public class Warehouse {

    private int uraniumUnits = 0;
    private int coalUnits = 0;
    private int heliumUnits = 0;
    private int energyUnits = 0;

    public Warehouse(){

    }

    public void setUraniumUnits(int uraniumUnits) {
        this.uraniumUnits += uraniumUnits;
    }

    public void setCoalUnits(int coalUnits) {
        this.coalUnits += coalUnits;
    }

    public void setUnits(MineTypes type, int supplyUnits) {
        switch(type){
            case COAL:
                this.coalUnits += supplyUnits;
                break;
            case HELIUM:
                this.heliumUnits += supplyUnits;
                break;
            case URANIUM:
                this.uraniumUnits += supplyUnits;
                break;
        }
    }

    public void setUnits(PlantType type, int supplyUnits) {
        switch(type){
            case COAL_PLANT:
                this.coalUnits -= supplyUnits;
                break;
            case FUSION_PLANT:
                this.heliumUnits += supplyUnits;
                break;
            case NUCLEAR_PLANT:
                this.uraniumUnits += supplyUnits;
                break;
        }
    }

    public void setHeliumUnits(int heliumUnits) {
        this.heliumUnits += heliumUnits;
    }


    public void setEnergyUnits(int energyUnits) {
        this.energyUnits += energyUnits;
    }


    public int getCoalUnits() {
        return coalUnits;
    }

    public int getHeliumUnits() {
        return heliumUnits;
    }

    public int getUraniumUnits() {
        return uraniumUnits;
    }

    public int getEnergyUnits() {
        return energyUnits;
    }

    public int getUnit(PlantType type) {
        switch(type){
            case COAL_PLANT:
                return getCoalUnits();
            case FUSION_PLANT:
                return getHeliumUnits();
            case NUCLEAR_PLANT:
                return getUraniumUnits();
            case SOLAR_PLANT:
                return 0;
        }
        return 0;
    }
}
