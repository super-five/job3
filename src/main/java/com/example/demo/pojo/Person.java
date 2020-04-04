package com.example.demo.pojo;

public class Person {
	private int id;
	private String name;
	private String vxnumber;
	private String phoneNumber;
	private String idcard;
	private String password;
	private int state;
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
	public String getVxnumber() {
		return vxnumber;
	}
	public void setVxnumber(String vxnumber) {
		this.vxnumber = vxnumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", vxnumber=" + vxnumber + ", phoneNumber=" + phoneNumber
				+ ", idcard=" + idcard + ", password=" + password + "]";
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
	

}
