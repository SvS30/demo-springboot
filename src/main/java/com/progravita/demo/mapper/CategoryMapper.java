package com.progravita.demo.mapper;

import com.progravita.demo.dto.CategoryDTO;
import com.progravita.demo.entity.Category;

public class CategoryMapper {
    public static CategoryDTO toDto(Category category) {
        return CategoryDTO.builder()
            .id(category.getId())
            .name(category.getName())
            .createdAt(category.getCreatedAt())
            .updatedAt(category.getUpdatedAt())
        .build();
    }

    public static Category toEntity(CategoryDTO categoryDTO) {
        return new Category(
            categoryDTO.getId(),
            categoryDTO.getName(),
            categoryDTO.getCreatedAt(),
            categoryDTO.getUpdatedAt()
        );
    }
}
