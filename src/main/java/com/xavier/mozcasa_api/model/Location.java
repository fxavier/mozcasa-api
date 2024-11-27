package com.xavier.mozcasa_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Document(collection = "locations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id
    @EqualsAndHashCode.Include
    private String id;
    private String name;
    private String address;
    private String city;
    private String village;
    private String zipCode;
    private String country;

    private Coordinates coordinates;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Coordinates {
        private Double latitude;
        private Double longitude;
    }

    
}
