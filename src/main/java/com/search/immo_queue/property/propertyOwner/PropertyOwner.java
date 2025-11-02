package com.search.immo_queue.property.propertyOwner;

import com.search.immo_queue.property.Property;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.Set;
import java.util.UUID;

@Entity(name = "property_owner")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyOwner {
    @Id
    @UuidGenerator
    private UUID id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    @OneToMany
    private Set<Property> properties;
}
