package ru.netology;

import lombok.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldPreviousStation() {

        //Уменьшение станции в валидном диапазоне
        radio.setCurrentStation(6);
        radio.previousStation();
        assertEquals(5, radio.getCurrentStation());

        //Переход с станции 0 на 9
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(10, radio.getCurrentStation());

        //Переход на граничную станцию
        radio.setCurrentStation(1);
        radio.previousStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {

        //Увеличение станции в валидном диапазоне
        radio.setCurrentStation(6);
        radio.nextStation();
        assertEquals(7, radio.getCurrentStation());

        //Переход со станции 9 на 0
        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());

        //Переход на граничную станцию
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(10, radio.getCurrentStation());
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
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());

        //Увеличение при максимальной громкости
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
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