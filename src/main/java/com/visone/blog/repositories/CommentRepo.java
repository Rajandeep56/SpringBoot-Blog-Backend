package com.visone.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visone.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository <Comment, Integer>{

}
