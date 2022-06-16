package com.java.designpatterns.abstractfactory;

public class FactoryGenerator {
    public static AbstractDressFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case DRESSTYPE:
                return new DressFactory();
        }
        return null;
    }
}
