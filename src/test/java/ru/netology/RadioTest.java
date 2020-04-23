package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio(5,7,0,20,0,50);

    @Test
    void shouldPreviousStation() {

        //Уменьшение станции в валидном диапазоне
        radio.setCurrentStation(5);
        radio.previousStation();
        assertEquals(4, radio.getCurrentStation());

        //Переход на граничную станцию
        radio.setCurrentStation(1);
        radio.previousStation();
        assertEquals(0, radio.getCurrentStation());

        //Переход с минимальной станции на максимальную
        radio.previousStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {

        //Увеличение станции в валидном диапазоне
        radio.setCurrentStation(6);
        radio.nextStation();
        assertEquals(7, radio.getCurrentStation());

        //Переход на граничную станцию
        radio.setCurrentStation(6);
        radio.nextStation();
        assertEquals(7, radio.getCurrentStation());

        //Переход с максимальной станции на минимальную
        radio.setCurrentStation(7);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldInputStation() {

        //Установка валидной станции
        radio.inputStation(7);
        assertEquals(7, radio.getCurrentStation());

        //Установка не валидной станции ниже минимума
        radio.setCurrentStation(3);
        radio.inputStation(-5);
        assertEquals(3, radio.getCurrentStation());

        //Установка не валидной станции выше минимума
        radio.setCurrentStation(9);
        radio.inputStation(15);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolume() {

        //Увеличиваем громкость
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());

        //Увеличение до границы
        radio.setCurrentVolume(49);
        radio.increaseVolume();
        assertEquals(50, radio.getCurrentVolume());

        //Увеличение при максимальной громкости
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void shouldReduceVolume() {

        //Уменьшение громкость
        radio.setCurrentVolume(3);
        radio.reduceVolume();
        assertEquals(2, radio.getCurrentVolume());

        //Уменьшение до границы
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());

        //Уменьшение при минимальной громкости
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}