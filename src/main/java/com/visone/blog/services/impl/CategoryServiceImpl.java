package com.visone.blog.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visone.blog.entities.Category;
import com.visone.blog.exceptions.ResourceNotFoundException;
import com.visone.blog.payloads.CategoryDto;
import com.visone.blog.repositories.CategoryRepo;
import com.visone.blog.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	
	private ModelMapper modelMapper;
	
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto)
	{
		Category cat = this.modelMapper.map(categoryDto, Category.class);
		
		Category addedCat = this.categoryRepo.save(cat);
		
		return this.modelMapper.map(addedCat, CategoryDto.class);
	}
	//update
	@Override
		public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
			
	
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category","CategoryId",categoryId));
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		cat.setCategoryDescription(categoryDto.getCategoryDescription());
		
		Category updateCat = this.categoryRepo.save(cat);
		
		return this.modelMapper.map(updateCat, CategoryDto.class);
	}
		
		//delete
	@Override
		public void deleteCategory(Integer categoryId) {
			Category cat = this.categoryRepo.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category","CategoryId",categoryId));
			
			this.categoryRepo.delete(cat);
		}
		
		//get
	@Override
		public CategoryDto getCategory(Integer categoryId) {
			
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category","CategoryId",categoryId));
		
			return this.modelMapper.map(cat, CategoryDto.class);
		}
		
		//getAll

		@Override
		
		public List<CategoryDto> getCategories(){
			List<Category> categories = this.categoryRepo.findAll();
			List <CategoryDto> catDtos = categories.stream().map((cat)-> this.modelMapper.map(cat, CategoryDto.class)).collect(Collectors.toList());
			
			return catDtos;
		}

}
