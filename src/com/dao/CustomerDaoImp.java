package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
//接口实现
public class CustomerDaoImp extends BaseDao implements CustomerDao {
	
	@Override
	public ResultSet selectCustomerByLogin(Connection conn, Customer c) throws SQLException {
		String sql = "select * from Customer where name = ? and password = ?";
		
		return super.QuaryData(conn, sql, c.getName(), c.getPassword());
		
	}

}
