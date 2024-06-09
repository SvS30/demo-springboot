package com.progravita.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progravita.demo.entity.Category;

/**
 * CategoryRepository
 */
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> { }