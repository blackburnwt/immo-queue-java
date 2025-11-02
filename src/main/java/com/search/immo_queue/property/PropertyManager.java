package com.search.immo_queue.property;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity(name = "property_manager")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyManager {
    @Id
    private UUID id;
    private String name;
    private String surname;
    @Column(name = "company_name")
    private String companyName;
    private String phone;
    private String email;
    @Embedded
    private Address companyAddress;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Property> property;
}
