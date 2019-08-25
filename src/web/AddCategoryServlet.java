package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AddCategoryService;

public class AddCategoryServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String category = request.getParameter("category");
		AddCategoryService service = new AddCategoryService();
		int rows = service.AddCategory(category);
		response.setCharacterEncoding("utf-8");
		if(rows>0) {
			response.getWriter().write("<script>alert('添加分类成功！');location.href='./add';</script>");
		}else {
			response.getWriter().write("<script>alert('添加分类失败！');location.href='./addCategory.jsp';</script>");
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}