package com.search.immo_queue.domain.property;

public enum HeatingType {
    CENTRAL("Central Heating"),
    ELECTRIC("Electric Heating"),
    GAS("Gas Heating"),
    DISTRICT("District Heating"),
    NONE("No Heating"),
    UNKNOWN("Unknown");

    private final String description;

    public String description() {
        return this.description;
    }

    HeatingType(String description) {
        this.description = description;

    }
}

