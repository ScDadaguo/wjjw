package com.guohao.wjjw.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TWork {
    private Integer workId;

    private Integer driverId;

    private Integer machineId;

    private String site;

    private String employer;

    private String constructors;

    private BigDecimal actualHours;

    private String invoiceHours;

    private Integer dieselCost;

    private Date workDate;

    private Integer cash;

    private Integer scooterOrderId;

    private Integer hourlyWage;

    private Integer receiveCash;

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer == null ? null : employer.trim();
    }

    public String getConstructors() {
        return constructors;
    }

    public void setConstructors(String constructors) {
        this.constructors = constructors == null ? null : constructors.trim();
    }

    public BigDecimal getActualHours() {
        return actualHours;
    }

    public void setActualHours(BigDecimal actualHours) {
        this.actualHours = actualHours;
    }

    public String getInvoiceHours() {
        return invoiceHours;
    }

    public void setInvoiceHours(String invoiceHours) {
        this.invoiceHours = invoiceHours == null ? null : invoiceHours.trim();
    }

    public Integer getDieselCost() {
        return dieselCost;
    }

    public void setDieselCost(Integer dieselCost) {
        this.dieselCost = dieselCost;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    public Integer getScooterOrderId() {
        return scooterOrderId;
    }

    public void setScooterOrderId(Integer scooterOrderId) {
        this.scooterOrderId = scooterOrderId;
    }

    public Integer getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(Integer hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public Integer getReceiveCash() {
        return receiveCash;
    }

    public void setReceiveCash(Integer receiveCash) {
        this.receiveCash = receiveCash;
    }
}