package service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import dao.CategoryDao;
import dao.ContentDao;
import domain.Blog;
import domain.Category;
import domain.Pl;
import domain.Setting;

public class CategoryService {

	public List<Blog> getCategory(String id) {
		
		CategoryDao dao=new CategoryDao();
		List<Blog> blog=null;
		try {
			blog=dao.getCategory(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return blog;
		
	}

	public List<Category> searchCategory() {
		CategoryDao dao=new CategoryDao();
		List<Category> category=null;
		try {
			category=dao.searchCategory();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return category;
	}

	public List<Pl> searchPl() {
		CategoryDao dao=new CategoryDao();
		List<Pl> pl=null;
		try {
			pl=dao.searchPl();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pl;
	}

	public List<Setting> searchSetting() {
		CategoryDao dao=new CategoryDao();
		List<Setting> setting =null;
		try {
			setting=dao.searchSetting();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return setting;
	}

}
