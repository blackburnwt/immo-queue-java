package com.search.immo_queue.property;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address {
    private String country;
    private String state;
    @Column(name = "zip_code")
    private String zipCode;
    private String city;
    private String street;
    @Column(name = "houseNumber")
    private String houseNumber;
    private String floor;
    @Column(name = "addition_info")
    private String additionalInfo;
}
