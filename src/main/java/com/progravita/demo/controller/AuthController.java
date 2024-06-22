package com.progravita.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progravita.demo.config.TokenProvider;
import com.progravita.demo.dto.UserDTO;
import com.progravita.demo.repository.IUserRepository;
import com.progravita.demo.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private AuthenticationManager authenticationManager;
    private PasswordEncoder passwordEncoder;
    private TokenProvider tokenProvider;
    private IUserRepository userRepo;
    private UserService userService;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager, PasswordEncoder passwordEncoder,
            TokenProvider tokenProvider, IUserRepository userRepo, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.passwordEncoder = passwordEncoder;
        this.tokenProvider = tokenProvider;
        this.userRepo = userRepo;
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> storeUser(@RequestBody UserDTO userDTO) {
        if (userRepo.existsByUsername(userDTO.getUsername())) {
            return new ResponseEntity<>("User was already registered", HttpStatus.BAD_REQUEST);
        }
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        this.userService.create(userDTO);
        return new ResponseEntity<>("User was stored successfully", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> authLogin(@RequestBody UserDTO userDTO) {
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(userDTO.getUsername(), userDTO.getPassword())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = tokenProvider.generateToken(authentication);
        return new ResponseEntity<>(token, HttpStatus.OK);
    }
}
