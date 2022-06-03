package com.java.designpatterns.strategy;

public interface OrderVisitor {
    int visit(Pasta pasta);

    int visit(Steak steak);
}
