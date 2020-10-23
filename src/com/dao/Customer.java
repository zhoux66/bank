package com.dao;

//实体类 对应数据库中的Customer表
public class Customer {
	private int id;
	private String name;
	private String password;
	private int age;
	private String gender;
	
	//空参构造
	public Customer() {
		super();
	}
	//2个参数name、password的构造
	public Customer(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public Customer(String name, String password, int age, String gender) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
	}
	public Customer(int id, String name, String password, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", gender="
				+ gender + "]";
	}

}
