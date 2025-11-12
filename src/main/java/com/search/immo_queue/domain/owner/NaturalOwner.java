package com.search.immo_queue.domain.owner;

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
