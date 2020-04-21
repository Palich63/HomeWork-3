package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {

    private int currentStation = 0;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentVolume = 20;
    private int minVolume = 0;
    private int maxVolume = 100;

    public void previousStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void inputStation(int inputStation) {
        if ((inputStation < minStation || inputStation > maxStation)) {
            return;
        }
        currentStation = inputStation;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void reduceVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }
}
