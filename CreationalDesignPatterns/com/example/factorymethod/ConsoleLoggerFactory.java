// ConsoleLoggerFactory.java
package com.example.factorymethod;

// Concrete factory creating ConsoleLogger instances
public class ConsoleLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
