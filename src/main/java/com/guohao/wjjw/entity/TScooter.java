package com.guohao.wjjw.entity;

public class TScooter {
    private Integer scooterId;

    private String scooterName;

    private String phoneNumber;

    private String modelNumber;

    public Integer getScooterId() {
        return scooterId;
    }

    public void setScooterId(Integer scooterId) {
        this.scooterId = scooterId;
    }

    public String getScooterName() {
        return scooterName;
    }

    public void setScooterName(String scooterName) {
        this.scooterName = scooterName == null ? null : scooterName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber == null ? null : modelNumber.trim();
    }
}