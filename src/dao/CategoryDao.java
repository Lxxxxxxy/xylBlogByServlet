package dao;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Blog;
import domain.Category;
import domain.Pl;
import domain.Setting;
import utils.DataSourceUtils;

public class CategoryDao {

	public List<Blog> getCategory(String id) throws SQLException {

		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from blog as b,category as c where c.id=? and b.category=c.category";
		List<Blog> blog = qr.query(sql, new BeanListHandler<Blog>(Blog.class),id);
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
		String sql = "select * from setting";
		List<Setting> setting = qr.query(sql, new BeanListHandler<Setting>(Setting.class));
		return setting;
	}

}
