package com.progravita.demo.mapper;

import com.progravita.demo.dto.CartItemDTO;
import com.progravita.demo.entity.CartItem;

public class CartItemMapper {
    public static CartItemDTO tDto(CartItem cartItem) {
        return CartItemDTO.builder()
            .id(cartItem.getId())
            .cart(cartItem.getCart())
            .course(cartItem.getCourse())
            .quantity(cartItem.getQuantity())
            .createdAt(cartItem.getCreatedAt())
            .updatedAt(cartItem.getUpdatedAt())
        .build();
    }

    public static CartItem toEntity(CartItemDTO cartItemDTO) {
        return new CartItem(
            cartItemDTO.getId(),
            cartItemDTO.getQuantity(),
            cartItemDTO.getCart(),
            cartItemDTO.getCourse(),
            cartItemDTO.getCreatedAt(),
            cartItemDTO.getUpdatedAt()
        );
    }
}
