package com.example.demo.server.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.PersonDao;
import com.example.demo.pojo.Person;
import com.example.demo.server.PersonService;
@Service
public class PersonServiceImpl implements PersonService {
	
	@Resource
	public PersonDao personDao;
	

	@Override
	public int add(Person t) {
		return personDao.add(t);
	}

	@Override
	public int delete(int i) {
		return personDao.delete(i);
	}

	@Override
	public int update(Person t) {
		return personDao.update(t);
	}

	@Override
	public List<Person> getList() {
		// TODO Auto-generated method stub
		return personDao.getList();
	}

	@Override
	public Person login(Person person) {
		Person p = personDao.getPerson(person.getPhoneNumber());
		if(null == p || p.getPassword() != person.getPassword() ) {
			return null;
		}
		return p;
	}

}
