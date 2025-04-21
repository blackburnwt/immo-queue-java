package com.search.immo_queue.property;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Document(collection = "property_manager")
@Builder
@Data
public class PropertyManager {
    @Id
    private UUID id;
    private String name;
    private String surname;
    @Field("company_name")
    private String companyName;
    private String phone;
    private String email;
    @Field("company_address")
    private Address companyAddress;
}
