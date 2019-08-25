package service;

import java.sql.SQLException;

import dao.AddCategoryDao;

public class AddCategoryService {

	public int AddCategory(String category) {
		AddCategoryDao dao=new AddCategoryDao();
		int rows=0;
		try {
			rows=dao.AddCategory(category);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

}
