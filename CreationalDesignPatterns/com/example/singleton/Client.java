// Client.java
package com.example.singleton;

// Client code using the Singleton
public class Client {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call methods on the singleton
        singleton.doSomething();
    }
}



// after complie run java com.example.singleton.Client
