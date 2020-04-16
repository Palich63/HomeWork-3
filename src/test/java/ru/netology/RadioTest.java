package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldPreviousStation(){
        Radio radio = new Radio();
        //Уменьшение станции
        radio.setCurrentStation(6);
        radio.previousStation();

        assertEquals(5, radio.getCurrentStation() );

        //Переход со станции 0 на 9
        radio.setCurrentStation(0);
        radio.previousStation();

        assertEquals(9, radio.getCurrentStation() );
    }

    @Test
    void shouldNextStation(){
        Radio radio = new Radio();
        //Уменьшение станции
        radio.setCurrentStation(6);
        radio.nextStation();

        assertEquals(7, radio.getCurrentStation() );

        //Переход со станции 9 на 0
        radio.setCurrentStation(9);
        radio.nextStation();

        assertEquals(0, radio.getCurrentStation() );
    }

    @Test
    void shouldInputStation() {
        Radio radio = new Radio();

        //Установка валидной станции
        radio.setNumberStation(7);
        radio.inputStation();
        assertEquals(7, radio.getCurrentStation());

        //Установка невалидной станции
        radio.setCurrentStation(5);
        radio.setNumberStation(50);
        radio.inputStation();
        assertEquals(5, radio.getCurrentStation());

        radio.setNumberStation(-50);
        radio.inputStation();
        assertEquals(5, radio.getCurrentStation());

        //Установка той же станции и граничной
        radio.setNumberStation(10);
        radio.inputStation();
        assertEquals(10, radio.getCurrentStation());


    }
}