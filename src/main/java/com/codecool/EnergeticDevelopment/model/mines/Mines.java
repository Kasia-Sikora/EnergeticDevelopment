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

}
