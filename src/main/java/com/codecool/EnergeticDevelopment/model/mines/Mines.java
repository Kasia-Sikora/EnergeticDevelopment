package com.codecool.EnergeticDevelopment.model.mines;

import com.codecool.EnergeticDevelopment.model.Produce;

public abstract class Mines implements Produce {

    int unitsProducePerDay;
    MineTypes type;

    Mines() {
    }

    @Override
    public int producePerDay() {
        return unitsProducePerDay;
    }

    public MineTypes getType() {
        return type;
    }

    public void setType(MineTypes type) {
        this.type = type;
    }

    public int getUnitsProducePerDay() {
        return unitsProducePerDay;
    }

    public void setUnitsProducePerDay(int unitsProducePerDay) {
        this.unitsProducePerDay = unitsProducePerDay;
    }

}
