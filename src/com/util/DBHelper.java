package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//工具类 连接数据库
public class DBHelper {
	private static String url = "jdbc:mysql://localhost:3306/software";
	private static String user = "root";
	private static String password = "root";
	
	//加载驱动
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


}
