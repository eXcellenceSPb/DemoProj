package com.example.demo.service;

import com.example.demo.dao.SntDao;
import com.example.demo.model.Snt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("SntService")
public class SntServiceImpl implements  SntService{
    private final SntDao sntDAO;

    public SntServiceImpl(SntDao sntDAO){
        this.sntDAO = sntDAO;
    }
    @Override
    public List<Snt> getAll() {
        return sntDAO.getAll();
    }

    @Override
    public void addSnt(Snt snt) {
        sntDAO.addSnt(snt);
    }

    @Override
    public Snt getSnt(Integer sntId) {
        return sntDAO.getSnt(sntId);
    }

    @Override
    public Snt updateSnt(Snt snt) {
        return sntDAO.updateSnt(snt);
    }

    @Override
    public void deleteSnt(Integer sntId) {
        sntDAO.deleteSnt(sntId);
    }

    @Override
    public boolean isExist(String sntName) {
        return sntDAO.isExist(sntName);
    }

    @Override
    public Page<Snt> findPaginated(Pageable pageable){
       final List<Snt> lists = sntDAO.getAll();
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Snt> list;

        if(lists.size() < startItem){
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, lists.size());
            list = lists.subList(startItem, toIndex);
        }

        return new PageImpl<>(list, PageRequest.of(currentPage, pageSize),
                lists.size());
    }
}
