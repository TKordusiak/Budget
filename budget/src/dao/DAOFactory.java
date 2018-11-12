package dao;

public abstract class DAOFactory {
	public abstract UserDAO getUserDAO();
	public abstract SavingsDAO getSavingDAO();
	public abstract PlannedDAO getPlannedDAO();
	public abstract OtherDAO getOtherDAO();
	public abstract MedicineDAO getMedicineDAO();
	public abstract FootDAO getFootsDAO();
	public abstract FinancialDAO getFinancialDAO();
	public abstract EntertainmentDAO getEntertainmentDAO();
	public abstract DevelopmentDAO getDevelopmentDAO();
	public abstract CosmeticsDAO getCosmeticsDAO();
	public abstract ClothesDAO getClothesDAO();
	public abstract BillsDAO getBillsDAO();
	

}
