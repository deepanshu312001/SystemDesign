// ConsoleLogger.java
package com.example.factorymethod;

// Concrete product implementing the Logger interface
public class ConsoleLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("Console Logger: " + message);
    }
}
