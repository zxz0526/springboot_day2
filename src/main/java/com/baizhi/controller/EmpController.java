package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("emp")
public class EmpController {

    @Autowired
    EmpService empService;

    @RequestMapping("showAll")
    public List<Emp> queryAll() {
        List<Emp> emps = empService.findAll();
        return emps;
    }

    @RequestMapping("delete")
    public Map<String, Object> delete(String id) {
        Map<String, Object> result = new HashMap<>();
        try {
            empService.removeEmp(id);
            result.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", false);
            result.put("message", "系统出错，请稍后再试");
        }
        return result;
    }

    @RequestMapping("update")
    public Map<String, Object> update(Emp emp) {
        Map<String, Object> result = new HashMap<>();
        try {
            empService.update(emp);
            result.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", false);
            result.put("message", "系统出错，请稍后再试");
        }
        return result;
    }

    @RequestMapping("add")
    public Map<String, Object> add(Emp emp) {
        Map<String, Object> result = new HashMap<>();
        try {
            empService.addEmp(emp);
            result.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("success", false);
            result.put("message", "系统出错，请稍后再试");
        }
        return result;
    }
}
