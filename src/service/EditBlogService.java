package service;

import java.sql.SQLException;
import java.util.List;

import dao.EditBlogDao;
import domain.Blog;
import domain.Category;

public class EditBlogService {

	public List<Blog> editBlog(String id) {
		EditBlogDao dao = new EditBlogDao();
		List<Blog> blog = null;
		try {
			blog = dao.editBlog(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return blog;
	}

	public List<Category> getCategory() {
		EditBlogDao dao = new EditBlogDao();
		List<Category> category = null;
		try {
			category = dao.getCategory();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return category;
	}

}
