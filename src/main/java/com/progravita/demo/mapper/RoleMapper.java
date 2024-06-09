package com.progravita.demo.mapper;

import com.progravita.demo.dto.RoleDTO;
import com.progravita.demo.entity.Role;

public class RoleMapper {
    public static RoleDTO tDto(Role role) {
        return RoleDTO.builder()
            .id(role.getId())
            .name(role.getName())
            .createdAt(role.getCreatedAt())
            .updatedAt(role.getUpdatedAt())
        .build();
    }

    public static Role toEntity(RoleDTO roleDTO) {
        return new Role(
            roleDTO.getId(),
            roleDTO.getName(),
            roleDTO.getCreatedAt(),
            roleDTO.getUpdatedAt()
        );
    }
}
