package com.search.immo_queue.domain.manager;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity(name = "company")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {

    @Id
    private UUID id;
    private String name;
    private String country;
    private String state;
    @Column(name = "zip_code")
    private String zipCode;
    private String city;
    private String street;
    @Column(name = "house_number")
    private String houseNumber;
}
