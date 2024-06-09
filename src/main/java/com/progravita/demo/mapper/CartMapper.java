package com.progravita.demo.mapper;

import com.progravita.demo.dto.CartDTO;
import com.progravita.demo.entity.Cart;

public class CartMapper {
    public static CartDTO tDto(Cart cart) {
        return CartDTO.builder()
            .id(cart.getId())
            .user(cart.getUser())
            .subtotal(cart.getSubtotal())
            .discount(cart.getDiscount())
            .total(cart.getTotal())
            .createdAt(cart.getCreatedAt())
            .updatedAt(cart.getUpdatedAt())
        .build();
    }

    public static Cart toEntity(CartDTO cartDTO) {
        return new Cart(
            cartDTO.getId(),
            cartDTO.getSubtotal(),
            cartDTO.getDiscount(),
            cartDTO.getTotal(),
            cartDTO.getUser(),
            cartDTO.getCreatedAt(),
            cartDTO.getUpdatedAt()
        );
    }
}
