package com.example.demo.pojo;

import java.util.Date;

public class Company {
	private int id;
	private String name;//公司名
	private String post;//岗位
	private String nature;//公司性质(国企 ,私企 等)
	private String industry;//行业
	private String address;//地址
	private String conditions;//招聘的要求
	private String welfare;//公司的福利
	private String scale;//公司规模 , 多少人
	private String salary;//工资
	private String img;//公司的图片
	private Date updateTime ;
	private String description;
	private int state;//这是这条招聘的状态,0表示下线 , 1表示正在招人
	
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
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public String getWelfare() {
		return welfare;
	}
	public void setWelfare(String welfare) {
		this.welfare = welfare;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updatetime) {
		this.updateTime = updatetime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", post=" + post + ", nature=" + nature + ", industry="
				+ industry + ", address=" + address + ", condition=" + conditions + ", welfare=" + welfare + ", scale="
				+ scale + ", salary=" + salary + ", img=" + img + ", updatetime=" + updateTime + ", state=" + state
				+ "]";
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	


}
