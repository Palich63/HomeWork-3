package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    @Test
    void shouldNextPreviousStation(){

        radio.setCurrentStation(6);
        //Уменьшение станции
        radio.previousStation();
        assertEquals(5, radio.getCurrentStation() );
        //Увеличение станции
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation() );

        //Переход со станции 0 на 9
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation() );
        //Переход со станции 9 на 0
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation() );
    }

    @Test
    void shouldInputStation() {

        //Установка валидной станции
        radio.setNumberStation(7);
        radio.inputStation();
        assertEquals(7, radio.getCurrentStation());

        //Установка невалидной станции
        radio.setCurrentStation(5);
        radio.setNumberStation(19);
        radio.inputStation();
        assertEquals(5, radio.getCurrentStation());

        radio.setCurrentStation(8);
        radio.setNumberStation(-21);
        radio.inputStation();
        assertEquals(8, radio.getCurrentStation());

        //Установка той же станции и граничной
        radio.setNumberStation(0);
        radio.inputStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseReduceVolume(){

        radio.setCurrentVolume(7);
       //Увеличиваем громкость
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
        //Уменьшение громкость
        radio.reduceVolume();
        assertEquals(7, radio.getCurrentVolume());

        //Максимальная громкость
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());

        //Минимальная громкость
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}