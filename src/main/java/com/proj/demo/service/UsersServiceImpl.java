package com.proj.demo.service;

import com.proj.demo.dao.UsersDao;
import com.proj.demo.model.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("UsersService")
public class UsersServiceImpl implements UsersService {

    private final UsersDao usersDao;

    public UsersServiceImpl(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public List<Users> getAll() {
        return usersDao.getAll();
    }

    @Override
    public void addUser(Users user) {
        usersDao.addUser(user);
    }

    @Override
    public Page<Users> findPaginated(Pageable pageable, List<Users> usersList) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Users> list;

        if (usersList.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, usersList.size());
            list = usersList.subList(startItem, toIndex);
        }

        return new PageImpl<>(list, PageRequest.of(currentPage, pageSize),
                usersList.size());
    }

    @Override
    public List<Users> getUsersByGroup(int groupId) {
        return usersDao.getUsersByGroup(groupId);
    }

    @Override
    public Users updateUser(Users user) {
        return usersDao.updateUser(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        usersDao.deleteUser(userId);
    }

    @Override
    public boolean isExist(String userName) {
        return usersDao.isExist(userName);
    }

    @Override
    public List<Users> getAllChairman() {
        return usersDao.getAllChairman();
    }
}
