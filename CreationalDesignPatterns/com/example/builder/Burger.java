// Burger.java
package com.example.builder;

// Concrete class implementing the Item interface for burgers
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
