package com.james.bootstrap.service;

import com.james.bootstrap.entity.MenuItem;
import com.james.bootstrap.entity.MenuSet;


import java.util.List;

public class MenuServiceImpl implements MenuService{

    List<MenuSet> menuSets;

    @Override
    public List<MenuSet> getMenuSets() {
        return menuSets;
    }

    public MenuServiceImpl(){

        MenuItem userAdd=new MenuItem("Add New User","input_user");
        MenuItem productDetails=new MenuItem("User Details","show_users");

    }

}
