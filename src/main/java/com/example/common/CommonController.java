package com.example.common;


public interface CommonController<T> {
	//这里是公共的接口
	 ResultMap<T> add(T t);
	 ResultMap<T> delete(int t);
	 ResultMap<T> update(T t);
	 ResultMap<T> getList(T t);
	 
	 
}
