package dao;

import java.util.List;

import model.Entertainment;

public interface EntertainmentDAO extends GenericDAO<Entertainment, Long>{
	List<Entertainment> getAll();
}
