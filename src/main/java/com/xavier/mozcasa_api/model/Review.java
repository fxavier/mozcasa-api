package com.xavier.mozcasa_api.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @EqualsAndHashCode.Include
    private String id;

    private Double rating;

    private String comment;
    
    @DBRef
    private User user;

    @DBRef
    private Property property;

    private LocalDateTime createdAt;

    @PostConstruct
    public void init() {
        this.createdAt = LocalDateTime.now();
    }
}
