// MacOSCheckbox.java
package com.example.abstractfactory;

// Concrete product for macOS checkboxes
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a macOS checkbox");
    }
}

