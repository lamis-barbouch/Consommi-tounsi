package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entity.Category;

public interface ICategoryService {
	public int addCategory(Category category);  //by admin
	public int updateCategory(Category category);  //by admin
    public void deleteCategory( int id); //by admin
    public List<Category> getAllCategory(); 
    public Category getCategoryById(int id); 


}
