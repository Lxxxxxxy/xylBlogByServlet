package service;

import java.sql.SQLException;
import java.util.List;

import dao.CategoryDao;
import dao.SearchDao;
import domain.Blog;
import domain.Category;
import domain.Pl;
import domain.Setting;

public class SearchService {

	public List<Blog> getSearch(String search) {
		SearchDao dao = new SearchDao();
		List<Blog> blog=null;
		try {
			blog=dao.getSearch(search);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return blog;
	}

	public List<Category> searchCategory() {
		SearchDao dao = new SearchDao();
		List<Category> category=null;
		try {
			category=dao.searchCategory();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return category;
	}

	public List<Pl> searchPl() {
		SearchDao dao = new SearchDao();
		List<Pl> pl=null;
		try {
			pl=dao.searchPl();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pl;
	}

	public List<Setting> searchSetting() {
		SearchDao dao = new SearchDao();
		List<Setting> setting =null;
		try {
			setting=dao.searchSetting();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return setting;
	}

}
