package com.guohao.wjjw.entity;

import java.util.Date;

public class TDriverSalary {
    private Integer payOrderId;

    private Integer driverId;

    private Integer oneTimePay;

    private Date date;

    private String remarks;

    private Date leaveDate;

    private Integer leaveTime;

    public Integer getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(Integer payOrderId) {
        this.payOrderId = payOrderId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getOneTimePay() {
        return oneTimePay;
    }

    public void setOneTimePay(Integer oneTimePay) {
        this.oneTimePay = oneTimePay;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Integer getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Integer leaveTime) {
        this.leaveTime = leaveTime;
    }
}