package com.search.immo_queue.property.propertyOwner;

import com.search.immo_queue.property.Address;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Builder
@Document(collection = "property_owner")
public class PropertyOwner {
    @Id
    private UUID id;
    private String name;
    private String surname;
    private String phone;
    private String email;
}
