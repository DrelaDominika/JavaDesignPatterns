package com.java.designpatterns.templatemethod;

public class Buyer {

    public static void main(String[] args) {
        //long dress
        System.out.println("Long dress");
        DressTemplate longDress = new LongDress();
        longDress.produceDress();

        System.out.println();
        //short dress
        System.out.println("Short dress");
        DressTemplate shortDress = new ShortDress();
        shortDress.produceDress();
    }
}
