package web;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Admin;
import domain.Setting;
import service.LoginService;
import service.SettingService;

public class SettingServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SettingService service = new SettingService();
		List<Setting> setting = service.getSetting();

		request.setAttribute("setting", setting);

		String cookie_username = null;
		// 定义cookie_password
		String cookie_password = null;
		// 获得cookie
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				// 获得名字是cookie_username和cookie_password
				if ("cookie_username".equals(cookie.getName())) {
					cookie_username = cookie.getValue();
					// 恢复中文用户名
					cookie_username = URLDecoder.decode(cookie_username, "UTF-8");
				}
				if ("cookie_password".equals(cookie.getName())) {
					cookie_password = cookie.getValue();
				}
			}
		}

		LoginService service1 = new LoginService();
		List<Admin> admin = null;
		admin = service1.login(cookie_username, cookie_password);
		response.setCharacterEncoding("utf-8");

		if (!admin.iterator().hasNext()) {
			response.getWriter().write("<script>alert('login error!');parent.location.href='./login.jsp';</script>");
		} else
			request.getRequestDispatcher("/admin/setting.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}