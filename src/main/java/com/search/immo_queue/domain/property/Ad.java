package com.search.immo_queue.domain.property;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "ad")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ad {
    @Id
    @UuidGenerator
    private UUID id;
    private String title;
    private String description;
    private BigDecimal priceColdRent;
    private BigDecimal priceWarmRent;
    private LocalDateTime creationDate;
    private LocalDateTime availableFrom;
    private boolean isActive;
    private LocalDateTime isActiveFrom;
    @ManyToOne
    private Property property;

}
