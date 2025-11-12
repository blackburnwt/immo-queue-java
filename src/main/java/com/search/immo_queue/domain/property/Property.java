package com.search.immo_queue.domain.property;

import com.search.immo_queue.domain.Address;
import com.search.immo_queue.domain.owner.Owner;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.List;
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
    @JoinColumn(name = "owner_id")
    private Owner owner;
    @OneToMany(mappedBy = "property_id")
    private List<PropertyManager> propertyManager;
}
