// LegacySystemAdapter.java
package com.example.adapter;

// Adapter class adapting the LegacySystem to the NewSystem interface
public class LegacySystemAdapter implements NewSystem {
    private LegacySystem legacySystem;

    public LegacySystemAdapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void newRequest() {
        // Delegate the new request to the legacy system
        legacySystem.legacyRequest();
    }
}

