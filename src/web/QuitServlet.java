package web;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuitServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username_code = request.getParameter("username");// 中文 张三
		String password = request.getParameter("password");
		Cookie cookie_username = new Cookie("cookie_username", username_code);
		Cookie cookie_password = new Cookie("cookie_password", password);
		// 设置cookie的持久化时间
		cookie_username.setMaxAge(1);
		cookie_password.setMaxAge(1);
		// 设置cookie的携带路径
		cookie_username.setPath(request.getContextPath());
		cookie_password.setPath(request.getContextPath());
		// 发送cookie
		response.addCookie(cookie_username);
		response.addCookie(cookie_password);
		response.getWriter().write("<script>parent.location.href='./login.jsp';</script>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}