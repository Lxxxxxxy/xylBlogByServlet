package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Blog;
import domain.Category;
import domain.Pl;
import domain.Setting;
import utils.DataSourceUtils;

public class SearchDao {

	public List<Blog> getSearch(String search) throws SQLException {
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from blog where body like ? or title like ?";
		List<Blog> blog = qr.query(sql, new BeanListHandler<Blog>(Blog.class),"%"+search+"%","%"+search+"%");
		return blog;
	}

	public List<Category> searchCategory() throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from category";
		List<Category> category = qr.query(sql, new BeanListHandler<Category>(Category.class));
		return category;
	}

	public List<Pl> searchPl() throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from pl where pl!='' group by num desc";
		List<Pl> pl = qr.query(sql, new BeanListHandler<Pl>(Pl.class));
		return pl;
	}

	public List<Setting> searchSetting() throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from setting";
		List<Setting> setting=qr.query(sql, new BeanListHandler<Setting>(Setting.class));
		return setting;
	}

}
