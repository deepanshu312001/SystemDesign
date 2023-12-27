// MacOSButton.java
package com.example.abstractfactory;

// Concrete product for macOS buttons
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a macOS button");
    }
}

