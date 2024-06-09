package com.progravita.demo.dto;

import java.time.LocalDateTime;

import com.progravita.demo.entity.Course;
import com.progravita.demo.entity.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CommentDTO {
    private Long id;
    private String message;
    private User user;
    private Course course;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
