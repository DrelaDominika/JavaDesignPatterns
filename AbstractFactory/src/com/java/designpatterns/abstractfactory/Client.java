package com.java.designpatterns.abstractfactory;

public class Client {

    public static void main(String[] args) {
        Dress shortDress = FactoryGenerator.getFactory(FactoryType.DRESSTYPE).getDress(DressType.SHORTDRESS);

        System.out.println(shortDress.getDetails());

        AbstractDressFactory dressFactory = FactoryGenerator.getFactory(FactoryType.DRESSTYPE);
        Dress midiDress = dressFactory.getDress(DressType.MIDIDRESS);
        System.out.println(midiDress.getDetails());
        System.out.println(midiDress.toString());

        Dress longDress = dressFactory.getDress(DressType.LONGDRESS);
        System.out.println(longDress.getDetails());
        System.out.println(longDress.toString());
    }
}
