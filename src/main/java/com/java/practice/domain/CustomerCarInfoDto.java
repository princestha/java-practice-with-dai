package com.java.practice.domain;

public class CustomerCarInfoDto {
    private String carModel;
    private int carSeats;
    private boolean isSuv;
    private boolean isInsured;

    public CustomerCarInfoDto(String carModel, int carSeats, boolean isSuv) {
        this.carModel = carModel;
        this.carSeats = carSeats;
        this.isSuv = isSuv;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarSeats() {
        return carSeats;
    }

    public void setCarSeats(int carSeats) {
        this.carSeats = carSeats;
    }

    public boolean isSuv() {
        return isSuv;
    }

    public void setSuv(boolean suv) {
        isSuv = suv;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }
}
