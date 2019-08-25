package service;

import java.sql.SQLException;
import java.util.List;

import dao.AddDao;
import domain.Category;

public class AddService {

	public List<Category> getAdd() {
		
		AddDao dao=new AddDao();
		List<Category> category=null;
		try {
			category=dao.getAdd();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return category;
	}

}
