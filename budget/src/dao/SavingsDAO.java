package dao;

import java.util.List;

import model.Savings;

public interface SavingsDAO extends GenericDAO<Savings, Long>{
	List<Savings>getAll();

}
