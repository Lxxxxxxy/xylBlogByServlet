package dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import domain.Blog;
import utils.DataSourceUtils;

public class InsertDao {

	public int Insert(Blog blog) throws SQLException {
		QueryRunner qr=new QueryRunner(DataSourceUtils.getDataSource());
		String sql1="insert into blog values(?,?,?,?,?,?,?)";
		String sql2="update category set count=count+1 where category=?";
		String sql3="delete from blog where id=?";
		String sql4="update category set count=count-1 where category=?";
		System.out.println(blog.getId());
		qr.update(sql3,blog.getId());
		qr.update(sql4,blog.getCategory());
		int rows = qr.update(sql1,blog.getId(),blog.getTitle(),blog.getBody(),blog.getTime(),blog.getCategory(),blog.getMm(),blog.getYzmm());
		qr.update(sql2,blog.getCategory());
		return rows;
	}

}
