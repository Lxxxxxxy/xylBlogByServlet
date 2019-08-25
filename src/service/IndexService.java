package service;

import java.sql.SQLException;
import java.util.List;

import dao.IndexDao;
import domain.Blog;
import domain.Category;
import domain.Pl;
import domain.Setting;

public class IndexService {

	public List<Blog> searchBlog() {

		IndexDao dao = new IndexDao();
		List<Blog> blog = null;
		try {
			blog = dao.searchBlog();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return blog;

	}

	public List<Category> searchCategory() {
		
		IndexDao dao = new IndexDao();
		List<Category> category=null;
		try {
			category=dao.searchCategory();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return category;
	}

	public List<Pl> searchPl() {
		IndexDao dao = new IndexDao();
		List<Pl> pl=null;
		try {
			pl=dao.searchPl();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pl;
	}

	public List<Setting> searchSetting() {
		IndexDao dao =new IndexDao();
		List<Setting> setting =null;
		try {
			setting=dao.searchSetting();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return setting;
	}


}
