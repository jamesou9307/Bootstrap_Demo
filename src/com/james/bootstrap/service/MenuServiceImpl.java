package com.james.bootstrap.service;

import com.james.bootstrap.entity.MenuItem;
import com.james.bootstrap.entity.MenuSet;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    List<MenuSet> menuSets;

    @Override
    public List<MenuSet> getMenuSets() {
        return menuSets;
    }

    @Override
    public MenuSet getMenuSet(String menuName) {
        MenuSet target=null;
        for(MenuSet menuSet:menuSets){
            if(menuSet.getMenuSetName().equals(menuName)){
                target=menuSet;
            }
        }
        return target;
    }

    public MenuServiceImpl(){

        menuSets=new ArrayList<>();

        MenuItem userAdd=new MenuItem("Add New User","input_user");
        MenuItem userDetails=new MenuItem("User Details","show_users");
        List<MenuItem> userItem=new ArrayList<>();
        userItem.add(userAdd);
        userItem.add(userDetails);

        MenuSet usermenu=new MenuSet("users",userItem);

        menuSets.add(usermenu);


        MenuItem provinceDetails=new MenuItem("Province Details","show_province");
        List<MenuItem> provinceMenuItem=new ArrayList<>();
        provinceMenuItem.add(provinceDetails);

        MenuSet provincemenu=new MenuSet("provinces",provinceMenuItem);

        menuSets.add(provincemenu);



    }

}
