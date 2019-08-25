package web;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.Admin;
import service.LoginService;

public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		// 获取数据
		String username = request.getParameter("user");// 中文 张三
		String password = request.getParameter("password");

		LoginService service = new LoginService();
		List<Admin> admin = null;
		admin = service.login(username, password);
		response.setCharacterEncoding("UTF-8");
		if (admin.iterator().hasNext()) {
			String username_code = URLEncoder.encode(username, "UTF-8");

			Cookie cookie_username = new Cookie("cookie_username", username_code);
			Cookie cookie_password = new Cookie("cookie_password", password);
			// 设置cookie的持久化时间
			cookie_username.setMaxAge(60 * 60);
			cookie_password.setMaxAge(60 * 60);
			// 设置cookie的携带路径
			cookie_username.setPath(request.getContextPath());
			cookie_password.setPath(request.getContextPath());
			// 发送cookie
			response.addCookie(cookie_username);
			response.addCookie(cookie_password);
			// 重定向到首页
			response.sendRedirect("./index.jsp");

		} else {
			// 失败 转发到登录页面 提出提示信息
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write("<script>alert('login error!');parent.location.href='./login.jsp';</script>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}