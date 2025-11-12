package com.search.immo_queue.domain.owner;

import com.search.immo_queue.domain.Address;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;


@Getter
@Setter
public class LegalOwner{
    @Id
    private UUID id;
    @Field("company_name")
    private String companyName;
    @Field("company_address")
    private Address companyAddress;
    @Field("company_phone")
    private String companyPhone;
    @Field("company_email")
    private String companyEmail;
}
