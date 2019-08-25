package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Blog;
import domain.Category;
import domain.Pl;
import domain.Setting;
import service.ContentService;
import service.IndexService;

public class ContentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		ContentService service = new ContentService();
		List<Blog> blog = service.getContent(id);
		request.setAttribute("blog", blog);

		List<Category> category = service.searchCategory();

		List<Pl> pl = service.searchPl(id);

		List<Setting> setting = service.searchSetting();
		
		request.setAttribute("blog", blog);

		request.setAttribute("category", category);

		request.setAttribute("pl", pl);

		request.setAttribute("setting", setting);

		request.getRequestDispatcher("/content.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}