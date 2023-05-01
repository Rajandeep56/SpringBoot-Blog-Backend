package com.visone.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visone.blog.entities.Category;

public interface CategoryRepo  extends JpaRepository<Category,Integer>{
	
	
}


