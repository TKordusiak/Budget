package dao;

import java.util.List;

import model.Bills;

public interface BillsDAO extends GenericDAO<Bills, Long>{
	List<Bills> getAll();

}
