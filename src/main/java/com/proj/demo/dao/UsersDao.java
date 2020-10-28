package com.proj.demo.dao;

import com.proj.demo.model.Users;

import java.util.List;

public interface UsersDao {
    List<Users> getAll();
    void addUser(Users user);
    List<Users> getUsersByGroup(int groupId);
    Users updateUser(Users user);
    void deleteUser(Integer userId);
    boolean isExist(String userName);
    List<Users> getAllChairman();
}
