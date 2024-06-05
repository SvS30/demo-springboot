package com.progravita.demo.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="name", nullable = false, length = 30)
    private String name;
    @Column(name="first_last_name", nullable = false, length = 50)
    private String firstLastName;
    @Column(name="second_last_name", nullable = true, length = 50)
    private String secondLastName;
    @Column(name="username", nullable = false, unique = true, length = 50)
    private String username;
    @Column(name="email", nullable = false, unique = true ,length = 100)
    private String email;
    @Column(name="password", nullable = false, length = 100)
    private String password;

    @CreationTimestamp
    @Column(name = "created_at" , nullable = true)
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at" , nullable = true)
    private LocalDateTime updatedAt;
}
