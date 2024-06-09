package com.progravita.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progravita.demo.entity.Comment;

/**
 * CommentRepository
 */
@Repository
public interface ICommentRepository extends JpaRepository<Comment, Long> { }