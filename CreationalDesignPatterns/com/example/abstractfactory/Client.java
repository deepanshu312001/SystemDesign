// Client.java
package com.example.abstractfactory;

// Client code using the abstract factory to create components
public class Client {
    public static void main(String[] args) {
        // Create a Windows GUI
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        // Render Windows components
        windowsButton.paint();
        windowsCheckbox.paint();

        // Create a macOS GUI
        GUIFactory macOSFactory = new MacOSFactory();
        Button macOSButton = macOSFactory.createButton();
        Checkbox macOSCheckbox = macOSFactory.createCheckbox();

        // Render macOS components
        macOSButton.paint();
        macOSCheckbox.paint();
    }
}



// run java com.example.abstractfactory.Client