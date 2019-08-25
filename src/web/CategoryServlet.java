package web;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Blog;
import domain.Category;
import domain.Pl;
import domain.Setting;
import service.CategoryService;

public class CategoryServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String id = request.getParameter("id");
		CategoryService service = new CategoryService();
		List<Blog> blog = service.getCategory(id);
		List<Category> category = service.searchCategory();
		List<Pl> pl = service.searchPl();

		List<Setting> setting = service.searchSetting();

		request.setAttribute("blog", blog);

		request.setAttribute("category", category);

		request.setAttribute("pl", pl);

		request.setAttribute("setting", setting);
		
		request.getRequestDispatcher("/category.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
}
