// ShapeCache.java
package com.example.prototype;

import java.util.HashMap;
import java.util.Map;

// Prototype manager
public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    // Load predefined prototypes into the map
    public static void loadCache() {
        Circle circle = new Circle();
        circle.draw();
        shapeMap.put("Circle", circle);

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        shapeMap.put("Rectangle", rectangle);
    }

    // Retrieve a clone of the cached shape based on its type
    public static Shape getShape(String shapeType) {
        Shape cachedShape = shapeMap.get(shapeType);
        return (Shape) cachedShape.clone();
    }
}

