package dao;

import exeption.NoSuchDbTypeExeption;

public abstract class DAOFactory {
	
	public static final int MYSQL_DAO_FACTORY = 1;
	
	public abstract UserDAO getUserDAO();
	public abstract TransactionDAO getTransactionDAO();
	public abstract SavindsDAO getSavingsDAO();
	public abstract PlannedDAO getPlannedDAO();
	public abstract MainDAO getMainDAO();
	public abstract LoginDAO getLoginDAO();
	public abstract CategoriesPlannedDAO getCategoriesPlanned();
	public abstract CategoriesDAO getCategoriesDAO();
	
	public static DAOFactory getDAOFactory(){
		DAOFactory factory = null;
		try {
			factory = getDAOFactory(MYSQL_DAO_FACTORY);
		}catch(NoSuchDbTypeExeption e) {
			e.printStackTrace();
		}
		return factory;
		
	}
	private static DAOFactory getDAOFactory(int type) throws NoSuchDbTypeExeption {
		switch(type) {
		case MYSQL_DAO_FACTORY:
			return new MysqlDAOFactory();
			default:
				throw new NoSuchDbTypeExeption();
		}

	}

}
