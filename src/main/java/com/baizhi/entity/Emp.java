package com.baizhi.entity;

import java.util.Date;

public class Emp {
   private String id;
   private String name;
   private Integer salary;
   private Integer age;
   private Date birthday;
   private String d_id;

    @Override
    public String toString() {
        return "Emp{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", birthday=" + birthday +
                ", d_id='" + d_id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getD_id() {
        return d_id;
    }

    public void setD_id(String d_id) {
        this.d_id = d_id;
    }

    public Emp(String id, String name, Integer salary, Integer age, Date birthday, String d_id) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.birthday = birthday;
        this.d_id = d_id;
    }

    public Emp() {
    }
}
