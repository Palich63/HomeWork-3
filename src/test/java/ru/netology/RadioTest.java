package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldPreviousStation() {
        radio.setMintStation(0);
        radio.setMaxStation(9);

        //Уменьшение станции в валидном диапазоне
        radio.setCurrentStation(6);
        radio.previousStation();
        assertEquals(5, radio.getCurrentStation());

        //Переход с станции 0 на 9
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());

        //Переход на граничную станцию
        radio.setCurrentStation(1);
        radio.previousStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        radio.setMaxStation(9);
        radio.setMintStation(0);

        //Увеличение станции в валидном диапазоне
        radio.setCurrentStation(6);
        radio.nextStation();
        assertEquals(7, radio.getCurrentStation());

        //Переход со станции 9 на 0
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());

        //Переход на граничную станцию
        radio.setCurrentStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldInputStation() {
        radio.setMintStation(0);
        radio.setMaxStation(9);

        //Установка валидной станции
        radio.inputStation(7);
        assertEquals(7, radio.getCurrentStation());

        //Установка минимальной станции
        radio.setCurrentStation(3);
        radio.inputStation(-5);
        assertEquals(3, radio.getCurrentStation());

        //Установка максимальной станции
        radio.setCurrentStation(9);
        radio.inputStation(15);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.setMaxVolume(10);

        //Увеличиваем громкость
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());

        //Увеличение до границы
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());

        //Увеличение при максимальной громкости
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldReduceVolume() {
        radio.setMinVolume(0);

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