package com.example.demo.dao;

import com.example.demo.model.Snt;

import java.util.List;

public interface SntDao {
    List<Snt> getAll();
    void addSnt(Snt snt);
    Snt getSnt(Integer sntId);
    Snt updateSnt(Snt snt);
    void deleteSnt(Integer sntId);
    boolean isExist(String sntName);
}
