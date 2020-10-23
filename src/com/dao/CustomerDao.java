package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

//方法接口
public interface CustomerDao {
	//增
	
	//删
	
	//改
	
	//查
	public ResultSet selectCustomerByLogin(Connection conn, Customer c) throws SQLException;
	
}
