package com.xavier.mozcasa_api.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xavier.mozcasa_api.model.User;
import com.xavier.mozcasa_api.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    
    @Transactional
    public User save(final User user) {
        return userRepository.save(user);
    }
    
}
