package com.baizhi.test;

import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeptTest extends BaseTest {

    @Autowired
    DeptService deptService;

    @Test
    public void queryAll() {
        List<Dept> dept = deptService.findAll();
        for (Dept dept1 : dept) {
            System.out.println(dept1);
        }
    }

}
