package com.james.bootstrap.entity;

import java.util.List;

public class MenuSet {

    private String menuSetName;
    private List<MenuItem> menuItems;

    public MenuSet() {
    }

    public MenuSet(String menuSetName, List<MenuItem> menuItems) {
        this.menuSetName = menuSetName;
        this.menuItems = menuItems;
    }

    public String getMenuSetName() {
        return menuSetName;
    }

    public void setMenuSetName(String menuSetName) {
        this.menuSetName = menuSetName;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
