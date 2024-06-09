package com.progravita.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.progravita.demo.entity.Course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CouponDTO {
    private Long id;
    private String code;
    private BigDecimal discount;
    private Course course;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
