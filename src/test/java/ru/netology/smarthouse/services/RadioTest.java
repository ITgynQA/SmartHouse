package ru.netology.smarthouse.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldNotSetAboveMaxStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(10);
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMinStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(-1);
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        int expected = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowMaxStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(8);
        int expected = 8;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMinStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(1);
        int expected = 1;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStationAfterNine() {
        Radio radio = new Radio();
        radio.setStationNumber(9);

        radio.setToNextStation();

        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStation() {
        Radio radio = new Radio();
        radio.setStationNumber(8);
        radio.setToNextStation();

        int expected = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStationBelowZero() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.setToPrevStation();

        int expected = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStation() {
        Radio radio = new Radio();
        radio.setStationNumber(1);
        radio.setToPrevStation();

        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolumeLevel(101);
        int expected = 0;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMinVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolumeLevel(-1);
        int expected = 0;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolumeLevel(100);
        int expected = 100;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolumeLevel(0);
        int expected = 0;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowMaxVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolumeLevel(99);
        int expected = 99;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMinVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolumeLevel(1);
        int expected = 1;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setVolumeLevel(100);

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolumeLevel(99);

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setVolumeLevel(0);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolumeLevel(1);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }
}

