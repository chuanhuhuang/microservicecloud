package com.grg.cloud.dao;

import com.grg.cloud.Dept;

import java.util.List;

// @Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
