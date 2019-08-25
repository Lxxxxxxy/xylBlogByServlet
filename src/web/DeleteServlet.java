package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DeleteService;

public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		DeleteService service = new DeleteService();
		int rows = service.delete(id);
		response.setCharacterEncoding("utf-8");
		if(rows>0) {
			response.getWriter().write("<script>alert('删除成功！');location.href='./edit';</script>");
		}else {
			response.getWriter().write("<script>alert('删除失败！');location.href='./edit';</script>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}