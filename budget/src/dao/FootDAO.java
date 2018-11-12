package dao;

import java.util.List;

import model.Foot;

public interface FootDAO extends GenericDAO<Foot, Long>{
	
	List<Foot> getAll();

}
