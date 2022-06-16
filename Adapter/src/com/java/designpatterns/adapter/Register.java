package com.java.designpatterns.adapter;

public class Register {

    public static void main(String[] args) {
        Person person = new Person();
        person.setCarNumber("AHD 21133311");
        person.setLicenseNumber("2217563");
        person.setBankAcc("AccNo122, SBI, 2345, Warsaw");

        Driver driver = new DriverAdapter(person);

        System.out.println("Car number: " + driver.getCarNumber());
        System.out.println("License number: " + driver.getLicenseNumber());
        System.out.println("Bank account: " + driver.getBankAcc().getBankName());
        System.out.println(driver.getBankAcc());

    }
}
