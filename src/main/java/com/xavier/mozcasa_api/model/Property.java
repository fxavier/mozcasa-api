package com.xavier.mozcasa_api.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Document(collection = "properties")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Property {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    private String title;

    private String description;

    private PropertyType propertyType;

    private List<String> images;

    private Double price;

    @DBRef
    private Location location;

    private LocalDateTime createdAt;

    private PropertyDetails details;

    @DBRef
    private User owner;

    @PostConstruct
    public void init() {
        this.createdAt = LocalDateTime.now();
    }
}
