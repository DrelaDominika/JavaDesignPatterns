package com.java.designpatterns.iterator;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {
    private MyCollection collection;
    private int index = 0;

    public MyIterator(MyCollection collection) {
        this.collection = collection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < collection.size();
    }

    @Override
    public Integer next() {
        return collection.get(index++);
    }
}
