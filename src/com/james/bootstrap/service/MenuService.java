package com.james.bootstrap.service;

import com.james.bootstrap.entity.MenuSet;

import java.util.List;

public interface MenuService {

    List<MenuSet> getMenuSets();
    MenuSet getMenuSet(String menuName);
}
