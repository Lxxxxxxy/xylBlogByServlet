package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Admin;
import utils.DataSourceUtils;

public class LoginDao {

	public List<Admin> login(String username, String password) throws SQLException {
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		String sql="select * from admin where user=? and password=?";
		List<Admin> admin = qr.query(sql, new BeanListHandler<Admin>(Admin.class),username,password);
		return admin;
	}

}
