package dao;

import java.util.List;

import model.Planned;

public interface PlannedDAO extends GenerictDAO<Planned, Long>{
	List<Planned>getAll();

}
