package com.progravita.demo.mapper;

import com.progravita.demo.dto.CourseDTO;
import com.progravita.demo.entity.Course;

public class CourseMapper {
    public static CourseDTO toDto(Course course) {
        return CourseDTO.builder()
            .id(course.getId())
            .title(course.getTitle())
            .description(course.getDescription())
            .price(course.getPrice())
            .category(course.getCategory())
            .createdAt(course.getCreatedAt())
            .updatedAt(course.getUpdatedAt())
        .build();
    }

    public static Course toEntity(CourseDTO courseDTO) {
        return new Course(
            courseDTO.getId(),
            courseDTO.getTitle(),
            courseDTO.getDescription(),
            courseDTO.getPrice(),
            courseDTO.getCategory(),
            courseDTO.getCreatedAt(),
            courseDTO.getUpdatedAt()
        );
    }
}
