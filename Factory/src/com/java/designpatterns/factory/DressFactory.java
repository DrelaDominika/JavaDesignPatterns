package com.java.designpatterns.factory;

public class DressFactory {
    public static Dress getDress(DressInfo dressInfo) {
        switch (dressInfo) {
            case ZARA:
                return new Zara("M", "pink");
            case BERSHKA:
                return new Bershka("S", "white");
            case HM:
                return new HM("L", "black");
        }
        return null;
    }
}

