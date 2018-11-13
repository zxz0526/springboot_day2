package com.baizhi.service;

import com.baizhi.dao.EmpDAO;
import com.baizhi.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpDAO empDAO;

    @Override
    public List<Emp> findAll() {
        return empDAO.queryAll();
    }

    @Override
    public void removeEmp(String id) {
        empDAO.delete(id);
    }

    @Override
    public void addEmp(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
        emp.setBirthday(new Date());
        empDAO.insert(emp);
    }

    @Override
    public void update(Emp emp) {
        empDAO.update(emp);
    }
}
