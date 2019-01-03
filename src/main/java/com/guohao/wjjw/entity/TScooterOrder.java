package com.guohao.wjjw.entity;

import java.util.Date;

public class TScooterOrder {
    private Integer scooterOrderId;

    private String startPlace;

    private String endPlace;

    private Integer scooterId;

    private Integer machineId;

    private Date orderDate;

    private Integer scooterCost;

    public Integer getScooterOrderId() {
        return scooterOrderId;
    }

    public void setScooterOrderId(Integer scooterOrderId) {
        this.scooterOrderId = scooterOrderId;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace == null ? null : startPlace.trim();
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace == null ? null : endPlace.trim();
    }

    public Integer getScooterId() {
        return scooterId;
    }

    public void setScooterId(Integer scooterId) {
        this.scooterId = scooterId;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getScooterCost() {
        return scooterCost;
    }

    public void setScooterCost(Integer scooterCost) {
        this.scooterCost = scooterCost;
    }
}