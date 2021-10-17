package com.company.manage.service;

public interface GeneralManageService<T> {
    T findById(int id);

    int add(T t);

    int update(T t, int id);

    int deleteById(T t);

    void print(T[] list);

    void sort();
}
