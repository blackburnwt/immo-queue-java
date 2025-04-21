package com.search.immo_queue.property.propertyOwner;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PropertyOwnerRepository extends ReactiveMongoRepository<PropertyOwner, UUID> {
}
