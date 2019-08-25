package service;

import java.sql.SQLException;

import dao.AddPlDao;

public class AddPlService {

	public int AddPl(String pl, String id, String name) {
		
		AddPlDao dao=new AddPlDao();
		int rows=0;
		try {
			rows = dao.AddPl(pl,id,name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

}
