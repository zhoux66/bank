package com.service;

import com.dao.Customer;

public interface CusotmerService {
	
	//查
	public Customer findCusByLogin(Customer c);
}
