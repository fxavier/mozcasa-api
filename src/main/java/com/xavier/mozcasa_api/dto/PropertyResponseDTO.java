package com.xavier.mozcasa_api.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.xavier.mozcasa_api.model.Location;
import com.xavier.mozcasa_api.model.PropertyDetails;
import com.xavier.mozcasa_api.model.PropertyType;
import com.xavier.mozcasa_api.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyResponseDTO {
    private String id;

    private String title;

    private String description;

    private PropertyType propertyType;

    private List<String> images;

    private Double price;

    private Location location;

    private LocalDateTime createdAt;

    private PropertyDetails details;

    private User owner;
}
