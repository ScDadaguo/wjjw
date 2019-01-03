package com.guohao.wjjw.entity;

import java.util.Date;

public class TMachine {
    private Integer machineId;

    private Integer modelNumber;

    private Integer bossId;

    private Integer buyingPrice;

    private Date purchasingDate;

    private Integer usageTime;

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Integer getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(Integer modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Integer getBossId() {
        return bossId;
    }

    public void setBossId(Integer bossId) {
        this.bossId = bossId;
    }

    public Integer getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Integer buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public Date getPurchasingDate() {
        return purchasingDate;
    }

    public void setPurchasingDate(Date purchasingDate) {
        this.purchasingDate = purchasingDate;
    }

    public Integer getUsageTime() {
        return usageTime;
    }

    public void setUsageTime(Integer usageTime) {
        this.usageTime = usageTime;
    }
}