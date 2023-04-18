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
    public void shouldNotSetAboveMaxStationNumberII() {
        Radio radio = new Radio(100);

        radio.setStationNumber(100);

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
    public void shouldNotSetBelowMinStationNumberII() {
        Radio radio = new Radio(100);

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
    public void shouldSetMaxStationNumberII() {
        Radio radio = new Radio(100);

        radio.setStationNumber(99);

        int expected = 99;
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
    public void shouldSetMinStationNumberII() {
        Radio radio = new Radio(100);

        radio.setStationNumber(0);

        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMiddleStationNumber() {
        Radio radio = new Radio();

        radio.setStationNumber(5);

        int expected = 5;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMiddleStationNumberII() {
        Radio radio = new Radio(100);

        radio.setStationNumber(50);

        int expected = 50;
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
    public void shouldSetBelowMaxStationNumberII() {
        Radio radio = new Radio(100);

        radio.setStationNumber(98);

        int expected = 98;
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
    public void shouldSetAboveMinStationNumberII() {
        Radio radio = new Radio(100);

        radio.setStationNumber(1);

        int expected = 1;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStationNumber() {
        Radio radio = new Radio();

        radio.setStationNumber(2);

        radio.setStationNumber(7);

        int expected = 7;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStationNumberII() {
        Radio radio = new Radio(100);

        radio.setStationNumber(20);

        radio.setStationNumber(70);

        int expected = 70;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();

        radio.setStationNumber(5);

        radio.setToNextStation();

        int expected = 6;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationII() {
        Radio radio = new Radio(100);

        radio.setStationNumber(50);

        radio.setToNextStation();

        int expected = 51;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAfterMax() {
        Radio radio = new Radio();

        radio.setStationNumber(9);

        radio.setToNextStation();

        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAfterMaxII() {
        Radio radio = new Radio(100);

        radio.setStationNumber(99);

        radio.setToNextStation();

        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();

        radio.setStationNumber(7);

        radio.setToPrevStation();

        int expected = 6;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationII() {
        Radio radio = new Radio(100);

        radio.setStationNumber(70);

        radio.setToPrevStation();

        int expected = 69;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationBelowMin() {
        Radio radio = new Radio();

        radio.setStationNumber(0);

        radio.setToPrevStation();

        int expected = 9;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationBelowMinII() {
        Radio radio = new Radio(100);

        radio.setStationNumber(0);

        radio.setToPrevStation();

        int expected = 99;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxVolumeLevel() {
        Radio radio = new Radio();

        radio.setVolumeLevel(50);

        radio.setVolumeLevel(101);

        int expected = 50;
        int actual = radio.getVolumeLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMinVolumeLevel() {
        Radio radio = new Radio();

        radio.setVolumeLevel(50);

        radio.setVolumeLevel(-1);

        int expected = 50;
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

