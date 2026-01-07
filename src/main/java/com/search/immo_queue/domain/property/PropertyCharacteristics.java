package com.search.immo_queue.domain.property;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Repräsentation der Spalten aus der Tabelle `property_characteristics`.
 * Feldnamen sind in camelCase; die ursprünglichen Spaltennamen stehen in Kommentaren.
 */
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PropertyCharacteristics {
    // property_floor: number
    @Column(name = "property_floor")
    private Integer propertyFloor;

    // property_type: PROPERTY_TYPE
    @Column(name = "property_type")
    private PropertyType propertyType;

    // pets_allowed: boolean
    @Column(name = "pets_allowed")
    private Boolean petsAllowed;

    // with_fireplace: boolean
    @Column(name = "with_fireplace")
    private Boolean withFireplace;

    // renovation_state: RENOVATION_STATE
    @Column(name = "renovation_state")
    private RenovationState renovationState;

    // minimal_rent_duration: number
    @Column(name = "minimal_rent_duration")
    private Integer minimalRentDuration;

    // price_change_policy: PRICE_POLICY
    @Column(name = "price_change_policy")
    private PricePolicy priceChangePolicy;

    // price_change_interval: PRICE_INTERVAL
    @Column(name = "price_change_interval")
    private PriceInterval priceChangeInterval;

    // as_shared_appartment: boolean
    @Column(name = "as_shared_appartment")
    private Boolean asSharedAppartment;

    // as_social_property: boolean
    @Column(name = "as_social_property")
    private Boolean asSocialProperty;

    // heating_type: HEATING_TYPE
    @Column(name = "heating_type")
    private HeatingType heatingType;

    // building_year: Number
    @Column(name = "building_year")
    private Integer buildingYear;

    // lift_available: boolean
    @Column(name = "is_lift_available")
    private Boolean isLiftAvailable;

    // basement_available: boolean
    @Column(name = "is_basement_available")
    private Boolean isBasementPresent;

    // storage_room_available: boolean
    @Column(name = "is_storage_room_available")
    private Boolean isStorageRoomPresent;

    // garage_type: GARAGE_TYPE
    @Column(name = "garage_type")
    private GarageType garageType;

    // balcony_available: boolean
    @Column(name = "property_floor")
    private Boolean isBalconyPresent;

    // terasse_available: boolean
    @Column(name = "is_terrace_available")
    private Boolean isTerracePresent;

    // garden_available: boolean
    @Column(name = "is_garden_available")
    private Boolean isGardenPresent;

    // efficiency_classification: EFFICIENCY_CLASS
    @Column(name = "efficiency_classification")
    private EfficiencyClass efficiencyClassification;

    private BigDecimal area;

    private PropertyType type;

    @Column(name = "num_of_bedrooms")
    private Integer numOfBedrooms;

    @Column(name = "addition_info")
    private String additionalInfo;
}
