package service;

import java.sql.SQLException;

import dao.DeleteDao;

public class DeleteService {

	public int delete(String id) {
		DeleteDao dao=new DeleteDao();
		int rows=0;
		try {
			rows=dao.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return rows;
	}

}
