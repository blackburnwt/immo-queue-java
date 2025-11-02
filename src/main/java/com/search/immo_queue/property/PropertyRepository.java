package com.search.immo_queue.property;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PropertyRepository extends CrudRepository<Property, UUID> {
}
