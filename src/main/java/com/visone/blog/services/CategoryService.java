package com.visone.blog.services;

import java.util.List;

import com.visone.blog.payloads.CategoryDto;

public interface CategoryService {

	
	//create
	public CategoryDto createCategory(CategoryDto cateogDto);
	
	//update
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete
	public void deleteCategory(Integer categoryId);
	
	//get
	public CategoryDto getCategory(Integer categoryId);
	
	//getAll

	List<CategoryDto> getCategories();

}
