package service;

import java.sql.SQLException;
import java.util.List;

import dao.LoginDao;
import domain.Admin;

public class LoginService {

	public List<Admin> login(String username, String password) {
		LoginDao dao=new LoginDao();
		List<Admin> admin=null;
		try {
			admin=dao.login(username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return admin;
	}

}
