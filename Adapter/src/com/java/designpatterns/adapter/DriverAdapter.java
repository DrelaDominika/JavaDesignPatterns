package com.java.designpatterns.adapter;

public class DriverAdapter extends TaxiDriver implements Driver {
    private Person person;

    public DriverAdapter(Person person) {
        this.person = person;
        this.adaptData();
    }

    private void adaptData() {
        this.setCarNumber(person.getCarNumber());
        this.setLicenseNumber(Integer.valueOf(person.getLicenseNumber()));
        String[] personBankAcc = person.getBankAcc().split(",");

        BankAcc driverBankAcc = new BankAcc();
        driverBankAcc.setAccNo(personBankAcc[0]);
        driverBankAcc.setBankName(personBankAcc[1]);
        driverBankAcc.setIFSCNo(personBankAcc[2]);
        driverBankAcc.setCityName(personBankAcc[3]);
        this.setBankAcc(driverBankAcc);

    }
}
