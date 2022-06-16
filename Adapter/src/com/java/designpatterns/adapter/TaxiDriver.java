package com.java.designpatterns.adapter;

public class TaxiDriver implements Driver {

    private String carNumber;
    private Integer licenseNumber;
    private BankAcc bankAcc;

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Integer getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(Integer licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public BankAcc getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(BankAcc bankAcc) {
        this.bankAcc = bankAcc;
    }

}
