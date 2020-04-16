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
        if ((currentStation + 1) >= 9) {
            currentStation = 0;
            return;
        }
        currentStation++;
    }

    public void inputStation(){
      if ((numberStation < 0 || numberStation > 9)){
          return;
      }
        currentStation = numberStation;
    }

    public void increaseVolume(){
        if ((currentVolume + 1) > 10) {
            return;
        }
        currentVolume++;
    }
    public void reduceVolume(){
        if ((currentVolume - 1) < 0) {
            return;
        }
        currentVolume--;
    }
}
