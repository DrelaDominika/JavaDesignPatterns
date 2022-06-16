package com.java.designpatterns.iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        MyCollection collection = new MyCollection(5, 64, 23, 646, 733);
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print("[" + value + "]");
        }
        System.out.println();
        
        for (Integer value : collection) {
            System.out.print("[" + value + "]");
        }
    }
}
