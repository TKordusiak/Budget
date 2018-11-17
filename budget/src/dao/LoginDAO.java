package dao;

import java.util.List;

import model.Login;

public interface LoginDAO extends GenerictDAO<Login, Long>{
	
	List<Login>getAll();
	Login getLoginByName(String Name);

}
