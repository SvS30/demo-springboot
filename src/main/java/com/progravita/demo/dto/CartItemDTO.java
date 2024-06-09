package com.progravita.demo.dto;

import java.time.LocalDateTime;

import com.progravita.demo.entity.Cart;
import com.progravita.demo.entity.Course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CartItemDTO {
    private Long id;
    private int quantity;
    private Cart cart;
    private Course course;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
