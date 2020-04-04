package com.example.demo.server.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.CompanyDao;
import com.example.demo.pojo.Company;
import com.example.demo.server.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Resource
	CompanyDao companydao;
	
	@Override
	public int add(Company t) {
		return companydao.add(t);
	}

	@Override
	public int delete(int i) {
		return companydao.delete(i);
	}

	@Override
	public int update(Company t) {
		return companydao.update(t);
	}

	@Override
	public List<Company> getList() {
		// TODO Auto-generated method stub
		return companydao.getList();
	}

}
