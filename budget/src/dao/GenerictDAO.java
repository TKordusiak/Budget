package dao;

import java.io.Serializable;
import java.util.List;

public interface GenerictDAO <T, PK extends Serializable>{
	
	//CRUD
	T creat(T newObject);
	T read (PK premaryKey);
	boolean update(T updateObject);
	boolean delate(PK key);
	List<T>getAll();
}
