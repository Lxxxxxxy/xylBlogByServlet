package dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Setting;
import utils.DataSourceUtils;

public class SettingDao {

	public List<Setting> getSetting() throws SQLException {
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from setting";
		List<Setting> setting = qr.query(sql, new BeanListHandler<Setting>(Setting.class));
		return setting;
	}

}
