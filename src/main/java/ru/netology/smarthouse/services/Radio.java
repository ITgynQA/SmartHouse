package ru.netology.smarthouse.services;

public class Radio {
    int stationNumber;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void setToNextStation() {
        stationNumber = stationNumber == 9 ? 0 : stationNumber + 1;
    }

    public void setToPrevStation() {
        stationNumber = stationNumber == 0 ? 9 : stationNumber - 1;
    }


    int volumeLevel;

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel < 0) {
            return;
        }
        if (newVolumeLevel > 100) {
            return;
        }
        volumeLevel = newVolumeLevel;
    }

    public void increaseVolume() {
        volumeLevel = volumeLevel < 100 ? volumeLevel + 1 : volumeLevel;
    }

    public void decreaseVolume() {
        volumeLevel = volumeLevel > 0 ? volumeLevel - 1 : volumeLevel;
    }
}
