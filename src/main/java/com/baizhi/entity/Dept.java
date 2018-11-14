package com.baizhi.entity;

import java.util.Date;

public class Dept {

    private String id;
    private String no;
    private String name;
    private Integer numbers;
    private Date createDate;

    @Override
    public String toString() {
        return "Dept{" +
                "id='" + id + '\'' +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", numbers=" + numbers +
                ", createDate=" + createDate +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Dept(String id, String no, String name, Integer numbers, Date createDate) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.numbers = numbers;
        this.createDate = createDate;
    }

    public Dept() {
    }
}
