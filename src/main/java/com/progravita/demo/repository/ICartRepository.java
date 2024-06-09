package com.progravita.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progravita.demo.entity.Cart;

/**
 * CartRepository
 */
@Repository
public interface ICartRepository extends JpaRepository<Cart, Long> { }