package com.visone.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.visone.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	
}
