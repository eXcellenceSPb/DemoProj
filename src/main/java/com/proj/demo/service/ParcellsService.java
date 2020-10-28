package com.proj.demo.service;

import com.proj.demo.model.Parcells;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ParcellsService {
    List<Parcells> getAll();
    void addParcells(Parcells parcells);
    Page<Parcells> findPaginated(Pageable pageable);
    Parcells updateParcel(Parcells parcel);
    void deleteParcel(Integer parcelId);
    boolean isExist(String parcelHouse);
    List<Parcells> findByUser(Integer UserId);
}
