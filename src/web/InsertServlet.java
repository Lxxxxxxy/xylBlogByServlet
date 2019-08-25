package web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import domain.Blog;
import service.InsertService;

public class InsertServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		Map<String, String[]> properties = request.getParameterMap();
		Blog blog=new Blog();
		try {
			BeanUtils.populate(blog, properties);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		if(properties.get("time")==null) {
			Date date=new Date();
			SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
			String time = format.format(date);
			blog.setTime(time);
		}
		InsertService service = new InsertService();
		int rows = service.Insert(blog);
		response.setCharacterEncoding("utf-8");
		if(rows>0) {
			response.getWriter().write("<script>alert('添加博客成功！');location.href='./add';</script>");
		}else {
			response.getWriter().write("<script>alert('添加博客失败！');location.href='./add';</script>");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}