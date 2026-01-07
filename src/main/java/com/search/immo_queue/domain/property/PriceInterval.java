package com.search.immo_queue.domain.property;

public enum PriceInterval {
    MONTHLY("Monthly"),
    YEARLY ("Yearly"),
    ONE_TIME("One Time"),
    UNKNOWN("Unknown");

    private final String description;

    public String description() {
        return this.description;
    }

    PriceInterval(String description) {
        this.description = description;

    }
}

