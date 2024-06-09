package com.progravita.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progravita.demo.entity.Coupon;

/**
 * CouponRepository
 */
@Repository
public interface ICouponRepository extends JpaRepository<Coupon, Long> { }