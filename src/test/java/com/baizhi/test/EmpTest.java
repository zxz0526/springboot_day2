package com.baizhi.test;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpTest extends BaseTest {

    @Autowired
    EmpService empService;

    @Test
    public void queryAll() {
        List<Emp> emps = empService.findAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

    @Test
    public void add() {
        Emp emp = new Emp();
        emp.setAge(18);
        empService.addEmp(emp);
    }

    @Test
    public void delete() {
        empService.removeEmp("f4180e42-291b-4be6-ac9d-71703bf09f8a");
    }

}
