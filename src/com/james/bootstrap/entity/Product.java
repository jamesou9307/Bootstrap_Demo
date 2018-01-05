package com.james.bootstrap.entity;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class Product {
    private long id;
    private String productname;
    private String description;
    private float price;
    private Category category;
    private List<MultipartFile> images;

    public Product() {
    }

    public Product(long id, String productname, String description, float price, Category category, List<MultipartFile> images) {
        this.id = id;
        this.productname = productname;
        this.description = description;
        this.price = price;
        this.category = category;
        this.images = images;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<MultipartFile> getImages() {
        return images;
    }

    public void setImages(List<MultipartFile> images) {
        this.images = images;
    }
}
