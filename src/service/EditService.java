package service;

import java.sql.SQLException;
import java.util.List;

import dao.EditDao;
import domain.Blog;

public class EditService {

	public List<Blog> getEdit() {
		
		EditDao dao = new EditDao();
		List<Blog> blog=null;
		try {
			blog = dao.getEdit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return blog;
		
	}

}
