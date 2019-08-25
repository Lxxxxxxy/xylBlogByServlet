package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Category;
import utils.DataSourceUtils;

public class AddDao {

	public List<Category> getAdd() throws SQLException {
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from category";
		List<Category> category = qr.query(sql, new BeanListHandler<Category>(Category.class));
		return category;
	}

}
