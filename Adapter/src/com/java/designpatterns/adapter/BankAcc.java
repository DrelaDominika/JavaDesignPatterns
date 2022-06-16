package com.java.designpatterns.adapter;

public class BankAcc {
    private String accNo;
    private String bankName;
    private String IFSCNo;
    private String cityName;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIFSCNo() {
        return IFSCNo;
    }

    public void setIFSCNo(String IFSCNo) {
        this.IFSCNo = IFSCNo;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    @Override
    public String toString() {
        return "BankAcc{" +
               "accNo='" + accNo + '\'' +
               ", bankName='" + bankName + '\'' +
               ", IFSCNo='" + IFSCNo + '\'' +
               ", cityName='" + cityName + '\'' +
               '}';
    }


}
