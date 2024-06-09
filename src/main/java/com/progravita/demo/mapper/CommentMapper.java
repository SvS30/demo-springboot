package com.progravita.demo.mapper;

import com.progravita.demo.dto.CommentDTO;
import com.progravita.demo.entity.Comment;

public class CommentMapper {
    public static CommentDTO tDto(Comment comment) {
        return CommentDTO.builder()
            .id(comment.getId())
            .message(comment.getMessage())
            .user(comment.getUser())
            .course(comment.getCourse())
            .createdAt(comment.getCreatedAt())
            .updatedAt(comment.getUpdatedAt())
        .build();
    }

    public static Comment toEntity(CommentDTO commentDTO) {
        return new Comment(
            commentDTO.getId(),
            commentDTO.getMessage(),
            commentDTO.getUser(),
            commentDTO.getCourse(),
            commentDTO.getCreatedAt(),
            commentDTO.getUpdatedAt()
        );
    }
}
