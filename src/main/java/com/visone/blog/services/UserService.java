package com.visone.blog.services;

import com.visone.blog.payloads.UserDto;
import java.util.*;
public interface UserService {

	UserDto createUser(UserDto user);
	UserDto updateuser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
