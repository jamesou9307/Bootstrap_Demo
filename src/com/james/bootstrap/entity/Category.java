package com.james.bootstrap.entity;

public class Category {

    private long id;
    private String categoryname;

    public Category() {
    }

    public Category(long id, String categoryname) {
        this.id = id;
        this.categoryname = categoryname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
