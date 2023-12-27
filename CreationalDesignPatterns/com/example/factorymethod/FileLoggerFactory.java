// FileLoggerFactory.java
package com.example.factorymethod;

// Concrete factory creating FileLogger instances
public class FileLoggerFactory implements LoggerFactory {
    private String fileName;

    // Constructor to set the file name
    public FileLoggerFactory(String fileName) {
        this.fileName = fileName;
    }

    // Implementation of the factory method to create FileLogger instances
    @Override
    public Logger createLogger() {
        return new FileLogger(fileName);
    }
}
