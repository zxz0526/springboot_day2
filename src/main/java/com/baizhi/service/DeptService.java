package com.baizhi.service;

import com.baizhi.entity.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> findAll();

    void addDept(Dept dept);

    void removeDept(String id);

    void updateDept(Dept dept);
}
