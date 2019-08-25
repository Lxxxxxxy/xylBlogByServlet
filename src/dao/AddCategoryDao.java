package dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import utils.DataSourceUtils;

public class AddCategoryDao {

	public int AddCategory(String category) throws SQLException {
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="insert into category values(null,?,0)";
		int rows = qr.update(sql, category);
		return rows;
	}

}
