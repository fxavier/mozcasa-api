package com.xavier.mozcasa_api.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.xavier.mozcasa_api.model.PropertyDetails;
import com.xavier.mozcasa_api.model.PropertyType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyRequestDTO {

    private String id;

    private String title;

    private String description;

    private String propertyType;

    private List<String> images;

    private Double price;

    private String locationId;

    private LocalDateTime createdAt;

    private PropertyDetails details;

    private String ownerId;
    
}
