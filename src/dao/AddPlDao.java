package dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.dbutils.QueryRunner;

import utils.DataSourceUtils;

public class AddPlDao {

	public int AddPl(String pl, String id, String name) throws SQLException {
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String time = format.format(date);
		String sql="insert into pl values(null,'"+id+"','"+pl+"','"+time+"','"+name+"')";
		int rows = qr.update(sql);
		return rows;
	}

}
