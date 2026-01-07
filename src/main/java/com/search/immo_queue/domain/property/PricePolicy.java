package com.search.immo_queue.domain.property;

public enum PricePolicy {
    FIXED("Fixed Price"),
    FLEXIBLE("Flexible Price"),
    NEGOTIABLE("Negotiable Price"),
    INDEXED("Indexed Price"),
    PROGRESSIVE("Progressive Price"),
    UNKNOWN("Unknown");

    private final String description;

    public String description() {
        return this.description;
    }

    PricePolicy(String description) {
        this.description = description;

    }
}

