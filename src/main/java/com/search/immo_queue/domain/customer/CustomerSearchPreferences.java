package com.search.immo_queue.domain.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity(name = "customer_search_preferences")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerSearchPreferences {
    @Id
    private UUID id;

    private Integer floorMin;
    private Integer floorMax;
    private Integer areaMin;
    private Integer areaMax;
    private Integer roomsMin;
    private Integer roomsMax;
    private Integer priceMin;
    private Integer priceMax;
    private Long longitude;
    private Long latitude;
}
