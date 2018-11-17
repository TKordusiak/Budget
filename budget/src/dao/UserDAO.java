package dao;

import java.util.List;

import model.User;

public interface UserDAO extends GenerictDAO<User, Long>{
	
	List<User>getAll();

}
