package com.tryc.designpattern.createtype.builder;

public interface Item {
    String name();

    Packing packing();

    float price();
}
