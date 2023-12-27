// WindowsCheckbox.java
package com.example.abstractfactory;

// Concrete product for Windows checkboxes
public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows checkbox");
    }
}

