package com.java.practice.repository.domain;

public class CarOwnerRepositoryDto {

    private String carModel;
    private int carSeats;
    private boolean isSuv;
    private boolean isOver21;
    private String state;

    public CarOwnerRepositoryDto(String carModel, int carSeats, boolean isSuv) {
        this.carModel = carModel;
        this.carSeats = carSeats;
        this.isSuv = isSuv;
    }

    public boolean isOver21() {
        return isOver21;
    }

    public void setOver21(boolean over21) {
        isOver21 = over21;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarSeats() {
        return carSeats;
    }

    public boolean isSuv() {
        return isSuv;
    }
}
