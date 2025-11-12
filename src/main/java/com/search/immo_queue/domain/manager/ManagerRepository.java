package com.search.immo_queue.domain.manager;

import com.search.immo_queue.domain.property.PropertyManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ManagerRepository extends JpaRepository<PropertyManager, UUID> {
}
