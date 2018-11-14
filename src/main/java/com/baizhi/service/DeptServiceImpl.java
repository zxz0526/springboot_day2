package com.baizhi.service;

import com.baizhi.dao.DeptDAO;
import com.baizhi.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Transactional
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDAO deptDAO;

    public List<Dept> findAll() {
        return deptDAO.queryAll();
    }

    @Override
    public void addDept(Dept dept) {
        dept.setId(UUID.randomUUID().toString());
        deptDAO.insert(dept);
    }

    @Override
    public void removeDept(String id) {
        deptDAO.delete(id);
    }

    @Override
    public void updateDept(Dept dept) {
        deptDAO.update(dept);
    }
}
