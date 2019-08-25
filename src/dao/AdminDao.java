package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Admin;
import utils.DataSourceUtils;

public class AdminDao {

	public List<Admin> getAdmin() throws SQLException {
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from admin";
		List<Admin> admin = qr.query(sql, new BeanListHandler<Admin>(Admin.class));
		return admin;
	}

}
