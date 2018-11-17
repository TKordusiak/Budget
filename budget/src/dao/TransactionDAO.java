package dao;

import java.util.List;

import model.Transaction;

public interface TransactionDAO extends GenerictDAO<Transaction, Long>{
	List<Transaction>getAll();

}
