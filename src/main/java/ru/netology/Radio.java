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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }


    public void setMintStation(int mintStation) {
        this.mintStation = mintStation;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMintStation() {
        return mintStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
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


    public void inputStation() {
        if ((currentStation == mintStation || currentStation == maxStation)) {
            return;
        }
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
