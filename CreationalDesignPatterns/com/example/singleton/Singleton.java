// Singleton.java
package com.example.singleton;

// Singleton class
public class Singleton {
    // Private static instance of the singleton
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // Initialization code, if any
    }

    // Public method to provide the global point of access to the singleton
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and properties of the singleton
    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }
}

