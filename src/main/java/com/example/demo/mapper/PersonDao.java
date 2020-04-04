package com.example.demo.mapper;

import com.example.common.CommonDao;
import com.example.demo.pojo.Person;

public interface PersonDao extends CommonDao<Person> {
	//1:通过手机号获取用户信息
	public Person getPerson(String phoneNumber);
}
