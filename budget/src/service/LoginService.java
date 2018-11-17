package service;

import dao.DAOFactory;
import dao.LoginDAO;
import model.Login;

public class LoginService {
	
	public void addLogin(String name, String password, String email) {
		Login login = new Login();
		login.setNama(name);
		login.setPassword(password);
		login.setEmail(email);
		DAOFactory factory = DAOFactory.getDAOFactory();
		LoginDAO loginDAO = factory.getLoginDAO();
		loginDAO.creat(login);
		
	}

}
