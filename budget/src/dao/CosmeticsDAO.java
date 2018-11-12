package dao;

import java.util.List;

import model.Cosmetics;

public interface CosmeticsDAO extends GenericDAO<Cosmetics, Long>{
	List<Cosmetics> getAll();

}
