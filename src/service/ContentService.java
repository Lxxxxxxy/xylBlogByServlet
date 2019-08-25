package service;

import java.sql.SQLException;
import java.util.List;

import dao.ContentDao;
import dao.IndexDao;
import domain.Blog;
import domain.Category;
import domain.Pl;
import domain.Setting;

public class ContentService {

	public List<Blog> getContent(String id) {
		
		ContentDao dao=new ContentDao();
		List<Blog> blog=null;
		try {
			blog=dao.getContent(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return blog;
	}

	public List<Category> searchCategory() {

		ContentDao dao=new ContentDao();
		List<Category> category=null;
		try {
			category=dao.searchCategory();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return category;
	}

	public List<Pl> searchPl(String id) {
		ContentDao dao=new ContentDao();
		List<Pl> pl=null;
		try {
			pl=dao.searchPl(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pl;
	}

	public List<Setting> searchSetting() {
		ContentDao dao=new ContentDao();
		List<Setting> setting =null;
		try {
			setting=dao.searchSetting();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return setting;
	}
	
	

}
