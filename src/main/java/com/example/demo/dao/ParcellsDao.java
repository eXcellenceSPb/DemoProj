package com.example.demo.dao;

import com.example.demo.model.Parcells;

import java.util.List;

public interface ParcellsDao {
    List<Parcells> getAll();
    void addParcells(Parcells parcells);
    Parcells updateParcel(Parcells parcel);
    void deleteParcel(Integer parcelId);
    boolean isExist(String parcelHouse);
    List<Parcells> getByUser(Integer userId);
}
