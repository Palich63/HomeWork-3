package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionTest {

    @Test
    void shouldIncreaseTemperature() {
        Condition condition = new Condition();
        condition.setMaxTemperature(32);

        for (condition.setCurrentTemperature(16); condition.getCurrentTemperature() < condition.getMaxTemperature();) {
             condition.increaseCurrentTemperature(condition.getCurrentTemperature());
            }
    assertEquals(condition.getMaxTemperature(), condition.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.setMinTemperature(16);

        for (condition.setCurrentTemperature(32); condition.getCurrentTemperature() > condition.getMinTemperature();) {
            condition.decreaseCurrentTemperature(condition.getCurrentTemperature());
        }
        assertEquals(condition.getMinTemperature(), condition.getCurrentTemperature());
    }
}