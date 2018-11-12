package dao;

import java.util.List;

import model.Medicine;

public interface MedicineDAO extends GenericDAO<Medicine, Long>{
	List<Medicine> getAll();
	

}
