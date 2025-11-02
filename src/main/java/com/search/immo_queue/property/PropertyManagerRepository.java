package com.search.immo_queue.property;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PropertyManagerRepository extends CrudRepository<PropertyManager, UUID> {
}
