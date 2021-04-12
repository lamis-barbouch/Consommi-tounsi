package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Category;
import tn.esprit.spring.repository.CategoryRepository;
@Service
public class CategoryService implements ICategoryService {
@Autowired
CategoryRepository categoryRep;
	
	@Override
	public int addCategory(Category category) {
		categoryRep.save(category);
		return category.getId_category();

		
	}

	@Override
	public int updateCategory(Category category) {
		categoryRep.save(category);
		return category.getId_category();
	}

	@Override
	public void deleteCategory(int id) {
		categoryRep.findById(id).orElse(null);
        categoryRep.deleteById(id);

	}

	@Override
	public List<Category> getAllCategory() {
		List<Category> categories = new ArrayList<Category>();
		categoryRep.findAll().forEach(category-> categories.add(category));;
		return categories;
	} 

	@Override
	public Category getCategoryById(int id) {
		 return categoryRep.findById(id).get();		
	}
	
	

}
