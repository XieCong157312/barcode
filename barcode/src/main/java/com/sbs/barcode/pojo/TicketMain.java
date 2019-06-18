package com.sbs.barcode.pojo;

import java.util.Date;

public class TicketMain {
    private String barcode;

    private String user;

    private Date buyTime;

    private String operatorId;

    private String ticketType;

    private Integer ticketPrice;

    private String flag;

    private String schoolName;

    private String touristName;

    private String guideName;

    private Integer touristAmount;

    private String discountType;

    private String discountReason;

    private Date discountDate;

    private String discountAuthorizer;

    private String complimentaryPerson;

    private Date complimentaryDate;

    private String complimentaryAuthorizer;

    private String plateNumber;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType == null ? null : ticketType.trim();
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName == null ? null : touristName.trim();
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName == null ? null : guideName.trim();
    }

    public Integer getTouristAmount() {
        return touristAmount;
    }

    public void setTouristAmount(Integer touristAmount) {
        this.touristAmount = touristAmount;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType == null ? null : discountType.trim();
    }

    public String getDiscountReason() {
        return discountReason;
    }

    public void setDiscountReason(String discountReason) {
        this.discountReason = discountReason == null ? null : discountReason.trim();
    }

    public Date getDiscountDate() {
        return discountDate;
    }

    public void setDiscountDate(Date discountDate) {
        this.discountDate = discountDate;
    }

    public String getDiscountAuthorizer() {
        return discountAuthorizer;
    }

    public void setDiscountAuthorizer(String discountAuthorizer) {
        this.discountAuthorizer = discountAuthorizer == null ? null : discountAuthorizer.trim();
    }

    public String getComplimentaryPerson() {
        return complimentaryPerson;
    }

    public void setComplimentaryPerson(String complimentaryPerson) {
        this.complimentaryPerson = complimentaryPerson == null ? null : complimentaryPerson.trim();
    }

    public Date getComplimentaryDate() {
        return complimentaryDate;
    }

    public void setComplimentaryDate(Date complimentaryDate) {
        this.complimentaryDate = complimentaryDate;
    }

    public String getComplimentaryAuthorizer() {
        return complimentaryAuthorizer;
    }

    public void setComplimentaryAuthorizer(String complimentaryAuthorizer) {
        this.complimentaryAuthorizer = complimentaryAuthorizer == null ? null : complimentaryAuthorizer.trim();
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber == null ? null : plateNumber.trim();
    }
}