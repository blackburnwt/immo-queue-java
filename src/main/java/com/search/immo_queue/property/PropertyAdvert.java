package com.search.immo_queue.property;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "property_advert")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyAdvert {
    @Id
    @UuidGenerator
    private UUID id;
    private String description;
    private PropertyType type;
    private BigDecimal price;

}
