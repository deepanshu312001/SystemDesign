// Client.java
package com.example.adapter;

// Client code using the NewSystem interface
public class Client {
    public static void main(String[] args) {
        // Using the NewSystem interface
        NewSystem newSystem = new NewSystemImpl();
        newSystem.newRequest();

        // Using the LegacySystem through the adapter
        LegacySystem legacySystem = new LegacySystem();
        NewSystem legacyAdapter = new LegacySystemAdapter(legacySystem);
        legacyAdapter.newRequest();
    }
}

