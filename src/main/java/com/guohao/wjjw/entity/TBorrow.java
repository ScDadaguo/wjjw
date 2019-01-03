package com.guohao.wjjw.entity;

import java.util.Date;

public class TBorrow {
    private Integer borrowOrder;

    private Integer machineId;

    private Date brrowdate;

    private Date returndate;

    public Integer getBorrowOrder() {
        return borrowOrder;
    }

    public void setBorrowOrder(Integer borrowOrder) {
        this.borrowOrder = borrowOrder;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Date getBrrowdate() {
        return brrowdate;
    }

    public void setBrrowdate(Date brrowdate) {
        this.brrowdate = brrowdate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }
}