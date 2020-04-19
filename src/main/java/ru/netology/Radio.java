package ru.netology;

public class Radio {

    private int currentStation;
    private int maxStation;
    private int mintStation;
    private int currentVolume;
    private int minVolume;
    private int maxVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMintStation() {
        return mintStation;
    }

    public void setMintStation(int mintStation) {
        this.mintStation = mintStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void previousStation() {
        if (currentStation == mintStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = mintStation;
            return;
        }
        currentStation++;
    }

    public void inputStation(int inputStation) {
        if ((inputStation < mintStation || inputStation > maxStation)) {
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
