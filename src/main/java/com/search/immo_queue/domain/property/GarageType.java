package com.search.immo_queue.domain.property;

public enum GarageType {
    PRIVATE("Private"),
    SHARED("Shared"),
    UNDERGROUND("Underground"),
    CARPORT("Carport"),
    UNKNOWN("Unknown"),
    NONE("None");

    private final String description;

    public String description() {
        return this.description;
    }

    GarageType(String description) {
        this.description = description;

    }
}
