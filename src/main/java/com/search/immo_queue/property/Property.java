package com.search.immo_queue.property;

import com.search.immo_queue.property.propertyOwner.PropertyOwner;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.UUID;

@Document(collection = "property")
@Builder
@Data
public class Property {
    @Id
    private UUID id;
    private BigDecimal area;
    private PropertyType type;
    private int bedrooms;
    private Address address;
    private PropertyOwner owner;
    @Field("property_manager")
    private PropertyManager propertyManager;
}
