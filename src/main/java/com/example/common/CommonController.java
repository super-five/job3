package com.example.common;


public interface CommonController<T> {
	public ResultMap<T> add(T t);
	public ResultMap<T> delete(int t);
	public ResultMap<T> update(T t);
	public ResultMap<T> getList(T t);
}
