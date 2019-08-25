package service;

import java.sql.SQLException;
import java.util.List;

import dao.SettingDao;
import domain.Setting;

public class SettingService {

	public List<Setting> getSetting() {
		SettingDao dao=new SettingDao();
		List<Setting> setting = null;
		try {
			setting=dao.getSetting();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return setting;
	}

}
