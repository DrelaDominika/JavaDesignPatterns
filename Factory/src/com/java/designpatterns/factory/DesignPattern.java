package com.java.designpatterns.factory;

public class DesignPattern {

    public static void main(String[] args) {
        Dress zara = DressFactory.getDress(DressInfo.ZARA);
        Dress bershka = DressFactory.getDress(DressInfo.BERSHKA);
        Dress hm = DressFactory.getDress(DressInfo.HM);
        System.out.println(zara.getConfiguration());
        System.out.println(zara.toString());
        System.out.println(bershka.getConfiguration());
        System.out.println(bershka.toString());
        System.out.println(hm.getConfiguration());
        System.out.println(hm.toString());
    }
}
