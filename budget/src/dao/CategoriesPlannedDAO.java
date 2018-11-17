package dao;

import java.util.List;

import model.CategoriesPlanned;

public interface CategoriesPlannedDAO extends GenerictDAO<CategoriesPlanned, Long>{
	List<CategoriesPlanned>getAll();

}
