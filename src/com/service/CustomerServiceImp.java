package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.Customer;
import com.dao.CustomerDaoImp;
import com.util.DBHelper;

public class CustomerServiceImp implements CusotmerService{
	private CustomerDaoImp cd;
	
	
	public CustomerServiceImp(){
		cd = new CustomerDaoImp();
	}
	
	@Override
	public Customer findCusByLogin(Customer c) {
		Connection conn =DBHelper.getConnection();
		
		try {
			ResultSet set = cd.selectCustomerByLogin(conn, c);
			if(set.next()){
				int id = set.getInt("id");
				String name = set.getString("name");
				String password = set.getString("password");
				int age = set.getInt("age");
				String gender = set.getString("gender");
				return new Customer(id, name, password, age, gender);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cd.closeAll();
		}
		return null;
	}
	
}
