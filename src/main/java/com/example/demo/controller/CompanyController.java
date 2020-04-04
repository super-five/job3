package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.CommonController;
import com.example.common.ResultMap;
import com.example.demo.pojo.Company;
import com.example.demo.server.CompanyService;

//@Controller
@RestController
@RequestMapping("company")
public class CompanyController implements CommonController<Company> {
	@Resource
	public CompanyService companyService;
	
	public ResultMap<Company> map = new ResultMap<Company>();

	@RequestMapping(value = "add")
	public ResultMap<Company> add(Company company) {
		try {
			System.out.println(company);
			company.setUpdateTime(new Date());
			companyService.add(company);
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
	public ResultMap<Company> delete(int id) {
		
		try {
			companyService.delete(id);
			map.setState(200);
			map.setMessage("success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			map.setState(505);
			map.setMessage("fail");
		}
		
		return map;
	}

	@RequestMapping(value = "update")
	public ResultMap<Company> update(Company company) {
		try {
			companyService.update(company);
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
	public ResultMap<Company> getList(Company company) {
		
		try {
			List<Company> list = companyService.getList();
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
	
	
}
