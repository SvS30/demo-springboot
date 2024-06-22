package com.progravita.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.progravita.demo.dto.UserDTO;
import com.progravita.demo.entity.Role;
import com.progravita.demo.entity.User;
import com.progravita.demo.mapper.UserMapper;
import com.progravita.demo.repository.IUserRepository;

@Service
public class UserService implements UserDetailsService {
    private final IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository userRepo) {
        this.userRepository = userRepo;
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Collection<GrantedAuthority> mapAuthorities(List<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return user;
    }

    public UserDTO create(UserDTO userDTO){
        User user = UserMapper.toEntity(userDTO);
        User userSaved = userRepository.save(user);
        return UserMapper.toDto(userSaved);
    }
}
