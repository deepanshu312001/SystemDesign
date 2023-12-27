// Wrapper.java
package com.example.builder;

// Concrete implementation of Packing representing a wrapper
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
