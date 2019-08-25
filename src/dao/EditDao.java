package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Blog;
import utils.DataSourceUtils;

public class EditDao {

	public List<Blog> getEdit() throws SQLException {
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from blog order by id desc";
		List<Blog> blog = qr.query(sql, new BeanListHandler<Blog>(Blog.class));
		return blog;
	}

}
