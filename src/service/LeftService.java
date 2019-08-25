package service;

import java.sql.SQLException;
import java.util.List;

import dao.LeftDao;
import domain.Setting;

public class LeftService {

	public List<Setting> getLeft() {
		
		LeftDao dao=new LeftDao();
		List<Setting> setting=null;
		try {
			setting=dao.getLeft();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return setting;
		
	}

}
