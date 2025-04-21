package com.search.immo_queue.property;

import com.search.immo_queue.property.propertyOwner.PropertyOwner;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.UUID;

@Document(collection = "property_advert")
@Builder
@Data
public class PropertyAdvert {
    @Id
    private UUID id;
    private String description;
    private PropertyType type;
    private BigDecimal price;

}
