package com.progravita.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progravita.demo.entity.Course;

/**
 * CourseRepository
 */
@Repository
public interface ICourseRepository extends JpaRepository<Course, Long> { }