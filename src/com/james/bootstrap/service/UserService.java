package com.james.bootstrap.service;

import com.james.bootstrap.entity.User;


import java.util.List;

public interface UserService {

    List<User> getUsers();
    User addUser(User user);
    long getNextId();
    User getUser(Long id);
}
