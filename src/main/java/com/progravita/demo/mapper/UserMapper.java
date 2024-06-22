package com.progravita.demo.mapper;

import com.progravita.demo.dto.UserDTO;
import com.progravita.demo.entity.User;

public class UserMapper {
    public static UserDTO toDto(User user) {
        return UserDTO.builder()
            .id(user.getId())
            .name(user.getName())
            .firstLastName(user.getFirstLastName())
            .secondLastName(user.getSecondLastName())
            .username(user.getUsername())
            .email(user.getEmail())
            .password(user.getPassword())
            .createdAt(user.getCreatedAt())
            .updatedAt(user.getUpdatedAt()).build();
    }

    public static User toEntity(UserDTO userDto) {
        return new User(
            userDto.getId(),
            userDto.getName(),
            userDto.getFirstLastName(),
            userDto.getSecondLastName(),
            userDto.getUsername(),
            userDto.getEmail(),
            userDto.getPassword(),
            null, userDto.getCreatedAt(),
            userDto.getUpdatedAt()
        );
    }
}
