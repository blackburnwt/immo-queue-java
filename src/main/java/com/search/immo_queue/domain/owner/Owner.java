package com.search.immo_queue.domain.owner;

import com.search.immo_queue.domain.property.Property;
import jakarta.persistence.Column;
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

@Entity(name = "owner")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    @Id
    @UuidGenerator
    private UUID id;
    @Column(name="first_name")
    private String firstName;
    private String secondName;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "owner")
    private Set<Property> properties;
}
