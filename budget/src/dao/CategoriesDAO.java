package dao;

import java.util.List;

import model.Categories;

public interface CategoriesDAO extends GenerictDAO<Categories, Long>{
	
	List<Categories>getAll();

}
