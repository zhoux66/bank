package test;

import org.junit.Test;

import com.dao.Customer;
import com.service.CustomerServiceImp;

public class TestAll {
	
	@Test
	public void one(){
		CustomerServiceImp cs = new CustomerServiceImp();
		
		String name = "admin";
		String password = "admin";
		
		Customer cus = cs.findCusByLogin(new Customer(name, password));
		System.out.println(cus);
	}
}
