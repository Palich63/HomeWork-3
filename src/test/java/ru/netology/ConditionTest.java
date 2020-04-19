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
        condition.increaseCurrentTemperature();
        assertEquals(21, condition.getCurrentTemperature());

        // Установка максимальной температцры. Проверка на границе
        condition.setCurrentTemperature(31);
        condition.increaseCurrentTemperature();
        assertEquals(32, condition.getCurrentTemperature());

        //Попытка увеличить температуру выше максимума
        condition.setCurrentTemperature(32);
        condition.increaseCurrentTemperature();
        assertEquals(32, condition.getCurrentTemperature());

    }

    @Test
    void decreaseCurrentTemperature() {
        Condition condition = new Condition();

        //Установка минимальной температуры
        condition.setMinTemperature(16);

        // Установка валидной температуры
        condition.setCurrentTemperature(20);
        condition.decreaseCurrentTemperature();
        assertEquals(19, condition.getCurrentTemperature());

        // Установка минимальной температуры. Проверка на границе
        condition.setCurrentTemperature(17);
        condition.decreaseCurrentTemperature();
        assertEquals(16, condition.getCurrentTemperature());

        //Попытка уменьшения температуры ниже минимума
        condition.setCurrentTemperature(16);
        condition.decreaseCurrentTemperature();
        assertEquals(16, condition.getCurrentTemperature());
    }
}