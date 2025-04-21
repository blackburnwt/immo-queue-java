package com.search.immo_queue.property.propertyOwner;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
public class NaturalOwner{
    @Id
    private UUID id;

}
