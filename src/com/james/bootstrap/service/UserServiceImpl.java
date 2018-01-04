package com.james.bootstrap.service;

import com.james.bootstrap.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl  implements  UserService{

    private List<User> users;

    @Override
    public List<User> getUsers() {
        return users;
    }

    public UserServiceImpl(){

        users=new ArrayList<>();

        User user1=new User(1l,"james",24,"engineer");
        User user2=new User(2l,"mai",25,"employee");
        User user3=new User(3l,"erika",20,"manager");
        User user4=new User(4l,"miona",21,"designer");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }



}
