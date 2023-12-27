// NewSystemImpl.java
package com.example.adapter;

// Concrete implementation of the NewSystem interface
public class NewSystemImpl implements NewSystem {
    @Override
    public void newRequest() {
        System.out.println("New System is processing the request.");
    }
}

