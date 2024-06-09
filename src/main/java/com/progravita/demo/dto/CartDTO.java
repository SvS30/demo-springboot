package com.progravita.demo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.progravita.demo.entity.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CartDTO {
    private Long id;
    private BigDecimal subtotal;
    private BigDecimal discount;
    private BigDecimal total;
    private User user;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
