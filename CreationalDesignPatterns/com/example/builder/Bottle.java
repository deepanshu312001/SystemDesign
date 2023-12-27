// Bottle.java
package com.example.builder;

// Concrete implementation of Packing representing a bottle
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
