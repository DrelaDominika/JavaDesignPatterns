package com.java.designpatterns.flyweight;

import java.util.HashMap;

public class DressFactory {
    private static HashMap<String, Dress> hashMap = new HashMap<String, Dress>();

    public static Dress getDress(String type) {
        Dress d = null;
        if (hashMap.containsKey(type)) {
            d = hashMap.get(type);
        } else {
            switch (type) {
                case "ShortDress":
                    System.out.println("Short dress is produced");
                    d = new ShortDress();
                    break;
                case "LongDress":
                    System.out.println("Long dress is produced");
                    d = new LongDress();
                    break;
                default:
                    throw new IllegalArgumentException("Dress type" + type + " does not exist");
            }
            hashMap.put(type, d);
        }
        return d;
    }
}

