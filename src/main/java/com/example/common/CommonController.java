package com.example.common;


public interface CommonController<T> {
	 ResultMap<T> add(T t);
	 ResultMap<T> delete(int t);
	 ResultMap<T> update(T t);
	 ResultMap<T> getList(T t);
}
