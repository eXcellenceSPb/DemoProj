package com.proj.demo.service;

import com.proj.demo.model.Snt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SntService {
    List<Snt> getAll();
    void addSnt(Snt snt);
    Snt getSnt(Integer sntId);
    Snt updateSnt(Snt snt);
    void deleteSnt(Integer sntId);
    boolean isExist(String sntName);
    Page<Snt> findPaginated(Pageable pageable);
}
