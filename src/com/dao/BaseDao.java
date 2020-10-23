package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 自定义的通用的增删改查方法
public class BaseDao {
	
	private Connection conn;
	private PreparedStatement ps;//可以用占位符来写SQL语句
	private ResultSet set;
	//通用的增删改
	public int updateData(Connection conn, String sql, Object... objs) throws SQLException{
		ps = conn.prepareStatement(sql);

		//给sql语句的问号赋值
		if(objs != null){
			for (int i = 0; i < objs.length; i++) {
				ps.setObject(i+1, objs[i]);
			}
		}
		//数据库修改更新操作
		return ps.executeUpdate();
	}
	
	//查
	public ResultSet QuaryData(Connection conn, String sql, Object... objs) throws SQLException{
		ps = conn.prepareStatement(sql);
		//给sql语句的问号赋值
		if(objs != null){
			for (int i = 0; i < objs.length; i++) {
				ps.setObject(i+1, objs[i]);
			}
		}
		set = ps.executeQuery();
		return set;
	}
	//关闭资源  先开后关
	public void closeAll(){
			try {
				if(set != null){
					set.close();
				}
				if(ps != null){
					ps.close();
				}
				if(conn != null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
