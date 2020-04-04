package com.example.demo.server;

import com.example.common.CommonService;
import com.example.demo.pojo.Person;

public interface PersonService extends CommonService<Person> {
	public Person login(Person person);
}
