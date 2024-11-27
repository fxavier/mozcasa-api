package com.xavier.mozcasa_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyDetails {
    
    private Integer yearBuilt;
    private Integer numberOfRooms;
    private Integer numberOfBathrooms;
    private Integer numberOfFloors;
    private Double area;
    private Integer parkingSpaces;
    private Boolean hasPool;
    private Boolean hasGarage;
    private Boolean hasSecuritySystem;
    private Boolean hasElevator;
    private Boolean hasAirConditioning;
    private Boolean hasBalcony;
    private Boolean hasStorage;
    private Boolean hasWashingMachine;
}
