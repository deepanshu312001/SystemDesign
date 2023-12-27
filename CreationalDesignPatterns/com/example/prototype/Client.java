// Client.java
package com.example.prototype;

// Client code using the Prototype pattern
public class Client {
    public static void main(String[] args) {
        // Load prototypes into the cache
        ShapeCache.loadCache();

        // Clone and use cached shapes
        Shape clonedCircle = ShapeCache.getShape("Circle");
        clonedCircle.draw();

        Shape clonedRectangle = ShapeCache.getShape("Rectangle");
        clonedRectangle.draw();
    }
}



// java com.example.prototype.Client
// javac *.java 
