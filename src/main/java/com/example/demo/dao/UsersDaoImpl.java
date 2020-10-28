package com.example.demo.dao;

import com.example.demo.model.Users;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import javax.persistence.Query;
import java.util.List;

@Repository("UsersDao")
@Transactional
public class UsersDaoImpl extends AbstractDao<Integer, Users> implements UsersDao{
    @Override
    public List<Users> getAll() {
        return getEm().createQuery("select a from Users a", Users.class)
                .getResultList();
    }

    @Override
    public List<Users> getAllChairman(){
        return getEm().createQuery("select a from Users a where a.role = 'CHAIRMAN'", Users.class)
                .getResultList();
    }

    @Override
    public void addUser(Users user) {
        persist(user);
    }

    @Override
    public List<Users> getUsersByGroup(int groupId) {
        Query query = getEm().createQuery("select a from Users a where a.group =:groupId", Users.class);
        query.setParameter("groupId", groupId);
        return query.getResultList();
    }

    @Override
    public Users updateUser(Users user) {
        merge(user);
        return user;
    }

    @Override
    public void deleteUser(Integer userId) {
        Users user = find(userId);
        delete(user);
    }

    @Override
    public boolean isExist(String userName) {
        Query query = getEm().createQuery("select case when count (e)>0 " +
                "then true " +
                "else false end from Users e where e.first_name =:name", Boolean.class);
        query.setParameter("name", userName);
        return (Boolean) query.getSingleResult();
    }
}
