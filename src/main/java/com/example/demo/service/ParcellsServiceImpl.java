package com.example.demo.service;

import com.example.demo.dao.ParcellsDao;
import com.example.demo.model.Parcells;
import com.example.demo.model.Snt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("ParcellsService")
public class ParcellsServiceImpl implements ParcellsService {
    private final ParcellsDao parcellsDao;

    public ParcellsServiceImpl(ParcellsDao parcellsDao) {
        this.parcellsDao = parcellsDao;
    }

    @Override
    public List<Parcells> getAll() {
        return parcellsDao.getAll();
    }

    @Override
    public void addParcells(Parcells parcells) {
        parcellsDao.addParcells(parcells);
    }

    @Override
    public Page<Parcells> findPaginated(Pageable pageable) {
        final List<Parcells> lists = parcellsDao.getAll();
        List<Parcells> list;
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;

        if (lists.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, lists.size());
            list = lists.subList(startItem, toIndex);
        }

        return new PageImpl<>(list, PageRequest.of(currentPage, pageSize),
                lists.size());
    }

    @Override
    public Parcells updateParcel(Parcells parcel) {
        return parcellsDao.updateParcel(parcel);
    }

    @Override
    public void deleteParcel(Integer parcelId) {
        parcellsDao.deleteParcel(parcelId);
    }

    @Override
    public boolean isExist(String parcelHouse) {
        return parcellsDao.isExist(parcelHouse);
    }

    @Override
    public List<Parcells> findByUser(Integer userId) {
        return parcellsDao.getByUser(userId);
    }
}
