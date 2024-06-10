package com.progravita.demo.service;

import java.util.Optional;

import com.progravita.demo.entity.User;
import com.progravita.demo.repository.IUserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {
    private final IUserRepository userRepository;

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
