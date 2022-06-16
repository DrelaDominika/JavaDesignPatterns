package com.java.designpatterns.abstractfactory;

public class DressFactory extends AbstractDressFactory {
    @Override
    Dress getDress(DressType dressType) {
        switch (dressType) {
            case SHORTDRESS:
                return new ShortDress("S", "white");
            case MIDIDRESS:
                return new MidiDress("M", "black");
            case LONGDRESS:
                return new LongDress("XL", "purple");
        }
        return null;
    }
}
