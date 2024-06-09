package com.progravita.demo.mapper;

import com.progravita.demo.dto.ReviewDTO;
import com.progravita.demo.entity.Review;

public class ReviewMapper {
    public static ReviewDTO tDto(Review review) {
        return ReviewDTO.builder()
                .id(review.getId())
                .rating(review.getRating())
                .comment(review.getComment())
                .user(review.getUser())
                .course(review.getCourse())
                .createdAt(review.getCreatedAt())
                .updatedAt(review.getUpdatedAt())
            .build();
    }

    public static Review toEntity(ReviewDTO reviewDTO) {
        return new Review(
            reviewDTO.getId(),
            reviewDTO.getRating(),
            reviewDTO.getComment(),
            reviewDTO.getUser(),
            reviewDTO.getCourse(),
            reviewDTO.getCreatedAt(),
            reviewDTO.getUpdatedAt()
        );
    }
}
