package com.xavier.mozcasa_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationDTO {

    private String name;
    private String address;
    private String city;
    private String village;
    private String zipCode;
    private String country;

    private Coordinates coordinates;

    @Data
    public static class Coordinates {
        private Double latitude;
        private Double longitude;
    }
    
}
