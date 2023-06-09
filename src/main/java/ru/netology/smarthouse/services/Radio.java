package ru.netology.smarthouse.services;

public class Radio {
    private int stationNumber;
    private int volumeLevel;

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
