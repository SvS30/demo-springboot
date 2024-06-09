package com.progravita.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progravita.demo.entity.Role;

/**
 * RoleRepository
 */
@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> { }