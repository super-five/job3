package com.example.demo.server.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.PictureDao;
import com.example.demo.pojo.Picture;
import com.example.demo.server.PictureService;
@Service
public class PictureServiceImpl implements PictureService {
	
	@Resource
	public PictureDao pictureDao;

	@Override
	public int add(Picture t) {
		// TODO Auto-generated method stub
		return pictureDao.add(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return pictureDao.delete(id);
	}

	@Override
	public int update(Picture t) {
		// TODO Auto-generated method stub
		return pictureDao.update(t);
	}

	@Override
	public List<Picture> getList() {
		// TODO Auto-generated method stub
		return pictureDao.getList();
	}

}
