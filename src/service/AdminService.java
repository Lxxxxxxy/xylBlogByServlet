package service;

import java.sql.SQLException;
import java.util.List;

import dao.AdminDao;
import domain.Admin;

public class AdminService {

	public List<Admin> getAdmin() {
		
		AdminDao dao = new AdminDao();
		List<Admin> admin = null;
		try {
			admin=dao.getAdmin();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return admin;
		
	}

}
