package com.james.bootstrap.entity;

public class MenuItem {

   private String menuname;
   private String action;

    public MenuItem() {
    }

    public MenuItem(String menuname, String action) {
        this.menuname = menuname;
        this.action = action;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
