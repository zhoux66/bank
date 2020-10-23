package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Customer;
import com.service.CustomerServiceImp;

public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	CustomerServiceImp cs;
	
	public LoginServlet(){
		cs = new CustomerServiceImp();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//处理乱码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		//处理弹框乱码
		resp.setContentType("text/html;charset=utf-8");
		
		String op = req.getParameter("op");
		
		if("login".equals(op)){
			login(req, resp);
		}
		
		
	}
	//登录
	protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("user");
		String pass = req.getParameter("password");
		
		System.out.println(name + "    " + pass);
		
		Customer cus = cs.findCusByLogin(new Customer(name, pass));
		
		PrintWriter out = resp.getWriter();
		if(cus != null){
			out.print("<script>alert('恭喜登录成功');location.href='success.html'</script>");
		}else{
			out.print("<script>alert('登录失败，返回重输');location.href='login.html'</script>");
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
	
}
