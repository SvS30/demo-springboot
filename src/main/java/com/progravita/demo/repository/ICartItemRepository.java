package com.progravita.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progravita.demo.entity.CartItem;

/**
 * CartItemRepository
 */
@Repository
public interface ICartItemRepository extends JpaRepository<CartItem, Long> { }