package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.CommonController;
import com.example.common.ResultMap;
import com.example.demo.pojo.Person;
import com.example.demo.server.PersonService;

//@Controller
@RestController
@RequestMapping("person")
public class PersonController implements CommonController<Person> {
	
	@Resource
	public PersonService personService;
	public ResultMap<Person> map = new ResultMap<Person>();

	@RequestMapping(value = "add")
	public ResultMap<Person> add(Person person) {
		System.out.println(person);
		try {
			personService.add(person);
			
			map.getMap().put("person", person);
			map.setState(200);
			map.setMessage("success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.setState(505);
			map.setMessage("fail");
		}
		
		return map;
	}

	@RequestMapping(value = "delete")
	public ResultMap<Person> delete(int id) {
		
		try {
			personService.delete(id);
			map.setMessage("success");
			map.setState(200);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.setState(505);
			map.setMessage("fail");
		}
		
		return map;
	}

	@RequestMapping(value = "update")
	public ResultMap<Person> update(Person person) {
		try {
			personService.update(person);
			map.setState(200);
			map.setMessage("success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.setState(505);
			map.setMessage("fail");
		}
		
		return map;
	}

	@RequestMapping(value = "list")
	public ResultMap<Person> getList(Person person) {
		try {
			List<Person> list = personService.getList();
			map.setState(200);
			map.setMessage("success");
			map.setList(list);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.setState(505);
			map.setMessage("fail");
		}
		
		return map;
	}
	
	@RequestMapping(value = "login")
	public ResultMap<Person> login(Person person){
		try {
			Person p = personService.login(person);
			
			if(null == person ) {
				map.setState(200);
				map.setMessage("用户名密码错误或未注册");
				
				return map;
			}
			
			map.setState(200);
			map.setMessage("success");
			map.getMap().put("person", p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.setState(505);
			map.setMessage("fail");
			
		}
		return map;
	}
	
}