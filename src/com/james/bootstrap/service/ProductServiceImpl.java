package com.james.bootstrap.service;

import com.james.bootstrap.entity.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    List<Category> categories;
    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    public ProductServiceImpl(){

        categories=new ArrayList<>();
        Category category1=new Category(1l,"SmartPhone");
        Category category2=new Category(2l,"Laptop");
        Category category3=new Category(3l,"Desktop");

        categories.add(category1);
        categories.add(category2);
        categories.add(category3);


    }
}
