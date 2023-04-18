package ru.netology.smarthouse.services;

public class Radio {
    private int stationNumber;
    private int volumeLevel;

    private int maxStation;

    public Radio(int countStation) {
        this.maxStation = countStation - 1;
    }

    public Radio() {
        this.maxStation = 9;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > maxStation) {
            return;
        }
        this.stationNumber = newStationNumber;
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel < 0) {
            return;
        }
        if (newVolumeLevel > 100) {
            return;
        }
        this.volumeLevel = newVolumeLevel;
    }

    public void setToNextStation() {
        stationNumber = stationNumber == maxStation ? 0 : stationNumber + 1;
    }

    public void setToPrevStation() {
        stationNumber = stationNumber == 0 ? maxStation : stationNumber - 1;
    }

    public void increaseVolume() {
        volumeLevel = volumeLevel < 100 ? volumeLevel + 1 : volumeLevel;
    }

    public void decreaseVolume() {
        volumeLevel = volumeLevel > 0 ? volumeLevel - 1 : volumeLevel;
    }
}
