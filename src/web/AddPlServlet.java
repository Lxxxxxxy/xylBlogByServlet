package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AddPlService;

public class AddPlServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String pl = request.getParameter("pl");
		String id= request.getParameter("id");
		String name=request.getParameter("name");
		AddPlService service =new AddPlService();
		int rows = service.AddPl(pl,id,name);
		response.setCharacterEncoding("utf-8");
		if(rows>0) {
			response.getWriter().write("<script>alert('评论成功！');location.href='content?id="+id+"';</script>");
		}else {
			response.getWriter().write("<script>alert('评论失败！');location.href='content?id="+id+"';</script>");
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}