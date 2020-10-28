package com.example.demo.dao;

import com.example.demo.model.Parcells;
import com.example.demo.model.Parcels_users;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository("ParcellsDao")
@Transactional
public class ParcellsDaoImpl extends AbstractDao<Integer, Parcells> implements ParcellsDao {
    @Override
    public List<Parcells> getAll() {
        return getEm().createQuery("select a from Parcells a", Parcells.class)
                .getResultList();
    }

    @Override
    public void addParcells(Parcells parcells) {
        persist(parcells);
    }

    @Override
    public Parcells updateParcel(Parcells parcel) {
        merge(parcel);
        return parcel;
    }

    @Override
    public void deleteParcel(Integer parcelId) {
        Parcells parcells = find(parcelId);
        delete(parcells);
    }

    @Override
    public boolean isExist(String parcelHouse) {
        Query query = getEm().createQuery("select case when count (e)>0 " +
                "then true " +
                "else false end from Parcells e where e.address_house =:name", Boolean.class);
        query.setParameter("name", parcelHouse);
        return (Boolean) query.getSingleResult();
    }

    @Override
    public List<Parcells> getByUser(Integer userId) {
        Query query = getEm().createQuery("SELECT a FROM Parcells a WHERE a.id = (SELECT e.parcels FROM Parcels_users e WHERE e.users =: name)", Parcells.class);
        query.setParameter("name", userId);
        return query.getResultList();
    }
}
