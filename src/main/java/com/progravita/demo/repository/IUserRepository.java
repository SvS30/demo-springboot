package com.progravita.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progravita.demo.entity.User;

/**
 * UserRepository
 */
@Repository
public interface IUserRepository extends JpaRepository<User, Long> { }