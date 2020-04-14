package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionTest {

    @Test
    public void shouldNotChangeFieldsValue() {
        ConditionAdvanced conditioner = new ConditionAdvanced();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(-100);
        assertEquals(-100, conditioner.getCurrentTemperature());
    }
}