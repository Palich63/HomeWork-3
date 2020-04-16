package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int numberStation;

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

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        this.numberStation = numberStation;
    }

    public void previousStation(){
        if ((currentStation - 1) <= -1){
            currentStation = 9;
            return;
        }
        currentStation--;
    }

    public void nextStation(){
        if ((currentStation + 1) >= 10) {
            currentStation = 0;
            return;
        }
        currentStation++;
    }

    public void inputStation(){
      if ((numberStation < 0 || numberStation > 10)){
          return;
      }
        currentStation = numberStation;
    }
}
