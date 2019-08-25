package dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import utils.DataSourceUtils;

public class DeleteDao {

	public int delete(String id) throws SQLException {
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		String sql1="delete from blog where id=?";
		String sql2="update category set count=count-1 where category in (select category from blog where id=? group by category)";
		qr.update(sql2,id);
		int rows = qr.update(sql1,id);
		return rows;
	}

}
