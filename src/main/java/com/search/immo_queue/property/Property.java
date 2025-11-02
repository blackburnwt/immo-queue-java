package com.search.immo_queue.property;

import com.search.immo_queue.property.propertyOwner.PropertyOwner;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "property")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Property {
    @Id
    @UuidGenerator
    private UUID id;
    private BigDecimal area;
    private PropertyType type;
    private int bedrooms;
    private Address address;
    @ManyToOne
    private PropertyOwner owner;
    @ManyToOne
    private PropertyManager propertyManager;
}
