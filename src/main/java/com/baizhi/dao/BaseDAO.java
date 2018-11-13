package com.baizhi.dao;

import java.util.List;

public interface BaseDAO<T> {

    T queryOne(T t);
    void insert(T t);
    List<T> queryAll();
    void delete(String id);
    void update(T t);
}
