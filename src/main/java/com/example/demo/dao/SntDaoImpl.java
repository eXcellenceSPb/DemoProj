package com.example.demo.dao;

import com.example.demo.model.Snt;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository("SntDao")
@Transactional
public class SntDaoImpl extends AbstractDao<Integer, Snt> implements SntDao {
    @Override
    public List<Snt> getAll() {
        return getEm().createQuery("select a from Snt a", Snt.class)
                .getResultList();
    }

    @Override
    public void addSnt(Snt snt) {
        persist(snt);
    }

    @Override
    public void deleteSnt(Integer sntId){
        Snt snt = find(sntId);
        delete(snt);
    }

    @Override
    public Snt getSnt(Integer sntId){
        return find(sntId);
    }

    @Override
    public Snt updateSnt(Snt snt){
        merge(snt);
        return snt;
    }

    @Override
    public boolean isExist(String sntName) {
        Query query = getEm().createQuery("select case when count (e)>0 " +
                "then true " +
                "else false end from Snt e where e.name =:name", Boolean.class);
        query.setParameter("name", sntName);
        return (Boolean) query.getSingleResult();
    }
}