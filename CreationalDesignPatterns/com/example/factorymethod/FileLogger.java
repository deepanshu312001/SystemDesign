// FileLogger.java
package com.example.factorymethod;

// Concrete product implementing the Logger interface
public class FileLogger implements Logger {
    private String fileName;

    // Constructor to set the file name
    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    // Implementation of logMessage for file logging
    @Override
    public void logMessage(String message) {
        // Implement file logging logic here
        System.out.println("File Logger [" + fileName + "]: " + message);
    }
}
