package com.sbs.barcode.pojo;

import java.util.Date;

public class TicketRecord extends TicketRecordKey {
    private String enterAddress;

    private Date exitDate;

    private String exitAddress;

    public String getEnterAddress() {
        return enterAddress;
    }

    public void setEnterAddress(String enterAddress) {
        this.enterAddress = enterAddress == null ? null : enterAddress.trim();
    }

    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    public String getExitAddress() {
        return exitAddress;
    }

    public void setExitAddress(String exitAddress) {
        this.exitAddress = exitAddress == null ? null : exitAddress.trim();
    }
}