package dao;

import java.util.List;

import model.Main;

public interface MainDAO extends GenerictDAO<Main, Long>{
	
	List<Main>getAll();

}
