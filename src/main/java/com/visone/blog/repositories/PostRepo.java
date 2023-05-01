package com.visone.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visone.blog.entities.Category;
import com.visone.blog.entities.Post;
import com.visone.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	List<Post> findByTitleContaining(String title);
	//List<Post> findByTitleContaining(String keyword);

}
