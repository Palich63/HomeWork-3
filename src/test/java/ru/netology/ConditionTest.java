package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionTest {

    @Test
    void shouldIncreaseTemperature() {
        Condition condition = new Condition();
        //Установка максимальной температуры
        condition.setMaxTemperature(32);

        // Установка валидной температуры
        condition.setCurrentTemperature(20);
        condition.increaseCurrentTemperature(condition.getCurrentTemperature());
        assertEquals(21, condition.getCurrentTemperature());

        // Установка температуры выше максимума
        condition.setCurrentTemperature(40);
        condition.increaseCurrentTemperature(condition.getCurrentTemperature());
        assertEquals(40, condition.getCurrentTemperature());

        //Установка температуры с выходом за максимум
        condition.setCurrentTemperature(32);
        condition.increaseCurrentTemperature(condition.getCurrentTemperature());
        assertEquals(32, condition.getCurrentTemperature());

    }

    @Test
    void decreaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.setMinTemperature(16);

        //assertEquals(condition.getMinTemperature(), condition.getCurrentTemperature());
    }
}