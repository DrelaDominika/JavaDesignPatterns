package com.java.designpatterns.flyweight;

public class Buyer {

    public static void main(String[] args) {
        Dress shortDress = DressFactory.getDress("ShortDress");
        shortDress.assignColour("Pink");
        shortDress.startProduction();
        shortDress.assignColour("Black");
        shortDress.startProduction();

        Dress longDress = DressFactory.getDress("LongDress");
        longDress.assignColour("Purple");
        longDress.startProduction();

        Dress silverDress = DressFactory.getDress("LongDress"); //no object is created
        silverDress.assignColour("Silver");
        silverDress.startProduction();
    }
}
