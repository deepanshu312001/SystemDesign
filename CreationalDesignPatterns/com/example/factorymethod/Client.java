// Client.java
package com.example.factorymethod;

// Client code demonstrating the use of LoggerFactory and Logger
public class Client {
    public static void main(String[] args) {
        // Using Console Logger
        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        Logger consoleLogger = consoleLoggerFactory.createLogger();
        consoleLogger.logMessage("This is a message logged to the console");

        // Using File Logger
        LoggerFactory fileLoggerFactory = new FileLoggerFactory("log.txt");
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.logMessage("This is a message logged to a file");
    }
}


// run java com.example.factorymethod.Client

