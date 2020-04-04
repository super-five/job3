package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.CommonController;
import com.example.common.ResultMap;
import com.example.common.utils.FileUtils;
import com.example.demo.pojo.Picture;
import com.example.demo.server.PictureService;


@RestController
@RequestMapping("picture")
public class PictureController implements CommonController<Picture> {
	
	@Resource
	public PictureService pictureService;
	public ResultMap<Picture> map = new ResultMap<Picture>();
	
	public static void main(String[] args) {
		
	}
	
	@RequestMapping("addlist")
	public String addList() {
		List<String> file = FileUtils.getFile();
		Picture picture = new Picture();
		for(int i = 0 ;i<file.size();i++) {
			picture = new Picture();
			picture.setName(file.get(i).split("/")[0]);
			picture.setPath("http://47.99.154.241:8080/picture/"+file.get(i));
			picture.setState(0);
			picture.setSubjectid(1);
			picture.setType("goods");
			picture.setVariety(file.get(i).split("/")[0]);
			picture.setDescribe("goods");
			pictureService.add(picture);
		}
		return "success";
	}
	
	@RequestMapping("addone")
	public ResultMap<Picture> addone( ) {
		try {
			Picture picture = new Picture();
			picture.setPath("http://47.99.154.241:8080/picture");
			picture.setState(0);
			picture.setSubjectid(1);
			picture.setType("goods");
			picture.setVariety("");
			picture.setDescribe("goods");
			//------------------------
			pictureService.add(picture);
			map.setState(200);
			map.setMessage("success");
		} catch (Exception e) {
			map.setState(505);
			map.setMessage("fail");
		}
		
		return map;
	}

	@RequestMapping("add")
	public ResultMap<Picture> add(Picture picture) {
		try {
			picture = new Picture();
			picture.setPath("http://47.99.154.241:8080/picture");
			picture.setState(0);
			picture.setSubjectid(1);
			picture.setType("goods");
			picture.setVariety("");
			//------------------------
			pictureService.add(picture);
			map.setState(200);
			map.setMessage("success");
		} catch (Exception e) {
			map.setState(505);
			map.setMessage("fail");
		}
		
		return map;
	}

	@RequestMapping("delete")
	public ResultMap<Picture> delete(int id) {
		
		try {
			pictureService.delete(id);
			map.setState(200);
			map.setMessage("success");
		} catch (Exception e) {
			map.setState(505);
			map.setMessage("fail");
		}
		
		return map;
	}

	@RequestMapping("update")
	public ResultMap<Picture> update(Picture picture) {
		try {
			pictureService.update(picture);
			map.setState(200);
			map.setMessage("success");
		} catch (Exception e) {
			map.setState(505);
			map.setMessage("fail");
		}
		
		return map;
	}

	@RequestMapping("list")
	public ResultMap<Picture> getList(Picture picture) {
		
		try {
			List<Picture> list = pictureService.getList();
			map.setState(200);
			map.setMessage("success");
			map.setList(list);
		} catch (Exception e) {
			map.setState(505);
			map.setMessage("fail");
		}
		
		return map;
	}
}
