// WindowsButton.java
package com.example.abstractfactory;

// Concrete product for Windows buttons
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows button");
    }
}

