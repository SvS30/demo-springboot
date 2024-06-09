package com.progravita.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.progravita.demo.entity.Course;
import com.progravita.demo.entity.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ReviewDTO {
    private Long id;
    private BigDecimal rating;
    private String comment;
    private User user;
    private Course course;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
