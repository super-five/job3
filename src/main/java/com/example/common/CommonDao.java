package com.example.common;

import java.util.List;

public interface CommonDao<T> {
	public int add(T t);
	public int delete(int i);
	public int update(T t);
	public List<T> getList();
	public int getCount();

}
