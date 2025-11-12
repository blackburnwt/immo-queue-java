package com.search.immo_queue.domain.manager;

import com.search.immo_queue.domain.Address;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity(name = "manager")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Manager {
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
}
