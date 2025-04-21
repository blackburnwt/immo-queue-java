package com.search.immo_queue.property;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.util.UUID;

public interface PropertyRepository extends ReactiveMongoRepository<Property, UUID> {
}
