package com.java.designpatterns.adapter;

public class Person {
    private String carNumber;
    private String licenseNumber;
    private String bankAcc;

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }



    @Override
    public String toString() {
        return "Person{" +
               "carNumber='" + carNumber + '\'' +
               ", licenseNumber='" + licenseNumber + '\'' +
               ", bankAcc='" + bankAcc + '\'' +
               '}';
    }
}
