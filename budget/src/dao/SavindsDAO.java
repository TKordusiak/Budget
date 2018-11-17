package dao;

import java.util.List;

import model.Savings;

public interface SavindsDAO extends GenerictDAO<Savings, Long>{
	List<Savings>getAll();

}
