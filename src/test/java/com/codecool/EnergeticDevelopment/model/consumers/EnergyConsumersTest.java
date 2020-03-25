package com.codecool.EnergeticDevelopment.model.consumers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnergyConsumersTest {

    private EnergyConsumers newYork = new NewYork();

    @Test
    void Test_Consume_Pass() {
        Assertions.assertTrue(newYork.consume(500000));
    }

    @Test
    void Test_Consume_Failed() {
        Assertions.assertFalse(newYork.consume(500));
    }

}