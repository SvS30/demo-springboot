package com.progravita.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progravita.demo.entity.Review;

/**
 * ReviewRepository
 */
@Repository
public interface IReviewRepository extends JpaRepository<Review, Long> { }