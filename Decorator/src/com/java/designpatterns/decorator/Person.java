package com.java.designpatterns.decorator;

public class Person {

    public static void main(String[] args) {
        BasicDress basicDress = new BasicDress();
        Dress dottedDress = new DottedDress(basicDress);
        dottedDress.design();

        System.out.println();
        System.out.println("Silk dress + basic dress");
        Dress silkDress = new SilkDress(basicDress);
        silkDress.design();

        System.out.println();
        System.out.println("Silk dress + dotted dress + basic dress");
        Dress sdbDress = new SilkDress(dottedDress);
        sdbDress.design();

        System.out.println();
        System.out.println("Basic dress");

        basicDress.design();
    }
}
