package com.proj.demo.dao;

import com.proj.demo.model.Snt;

import java.util.List;

public interface SntDao {
    List<Snt> getAll();
    void addSnt(Snt snt);
    Snt getSnt(Integer sntId);
    Snt updateSnt(Snt snt);
    void deleteSnt(Integer sntId);
    boolean isExist(String sntName);
}
