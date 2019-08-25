package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Blog;
import domain.Category;
import utils.DataSourceUtils;

public class EditBlogDao {

	public List<Blog> editBlog(String id) throws SQLException {
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		String sql1="select * from blog where id=?";
		List<Blog> blog = qr.query(sql1, new BeanListHandler<Blog>(Blog.class),id);
		
		return blog;
	}

	public List<Category> getCategory() throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from category";
		List<Category> category = qr.query(sql, new BeanListHandler<Category>(Category.class));
		return category;
	}

}
