package com.example.demo.service;

import com.example.demo.model.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UsersService {
    List<Users> getAll();
    void addUser(Users User);
    Page<Users> findPaginated(Pageable pageable, List<Users> usersList);
    List<Users> getUsersByGroup(int groupId);
    Users updateUser(Users user);
    void deleteUser(Integer userId);
    boolean isExist(String userName);
    List<Users> getAllChairman();
}
