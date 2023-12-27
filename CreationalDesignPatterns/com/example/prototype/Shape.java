// Shape.java
package com.example.prototype;

// Prototype interface
public interface Shape extends Cloneable {
    void draw();

    Object clone();
}

