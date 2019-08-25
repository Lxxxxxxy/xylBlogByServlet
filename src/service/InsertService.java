package service;

import java.sql.SQLException;

import dao.InsertDao;
import domain.Blog;

public class InsertService {

	public int Insert(Blog blog) {
		InsertDao dao=new InsertDao();
		int rows=0;
		try {
			rows=dao.Insert(blog);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows;
	}

}
