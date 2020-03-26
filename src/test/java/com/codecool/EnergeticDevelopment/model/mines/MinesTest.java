package com.codecool.EnergeticDevelopment.model.mines;

import com.codecool.EnergeticDevelopment.model.energyPlants.CoalPlant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinesTest {

    private Mines mine = new CoalMine();

    @Test
    void Test_producePerDay_Pass() {
        assertEquals(40, mine.producePerDay());
    }

    @Test
    void Test_producePerDay_Failed(){
        assertNotEquals(50, mine.producePerDay());
    }

    @Test
    void Test_getType_Pass() {
        assertEquals(MineTypes.COAL, mine.getType());
    }

    @Test
    void Test_getType_Failed(){
        assertNotEquals(MineTypes.HELIUM, mine.getType());
    }
}