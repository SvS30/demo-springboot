package com.progravita.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.progravita.demo.entity.Category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CourseDTO {
    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private Category category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
