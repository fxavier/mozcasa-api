package com.xavier.mozcasa_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private Role role;

    private Boolean isVerified = false;

    private String verificationToken;
    private LocalDateTime verificationExpires;

    private String resetPasswordToken;
    private LocalDateTime resetPasswordExpires;
}
