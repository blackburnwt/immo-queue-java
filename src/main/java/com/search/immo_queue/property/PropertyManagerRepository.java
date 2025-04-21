package com.search.immo_queue.property;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PropertyManagerRepository extends ReactiveMongoRepository<PropertyManager, String> {
}
