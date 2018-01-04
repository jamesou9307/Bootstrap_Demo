package com.james.bootstrap.service;


import com.james.bootstrap.entity.City;
import com.james.bootstrap.entity.Province;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService{

    List<Province> provinces;
    @Override
    public List<Province> getAllProvinces() {
        return provinces;
    }

    public ProvinceServiceImpl() {

        provinces=new ArrayList<>();
        City city1=new City("Foshan");
        City city2=new City("Shenzhen");
        City city3=new City("Guangzhou");
        City city4=new City("Dongguan");
        List<City> guangdongcities=new ArrayList<>();
        guangdongcities.add(city1);
        guangdongcities.add(city2);
        guangdongcities.add(city3);
        guangdongcities.add(city4);

        City city5=new City("Hangzhou");
        City city6=new City("Wenzhou");
        City city7=new City("Ningbo");
        List<City> zhejiangcities=new ArrayList<>();
        zhejiangcities.add(city5);
        zhejiangcities.add(city6);
        zhejiangcities.add(city7);

        City city8=new City("Luoyang");
        City city9=new City("Zhengzhou");
        City city10=new City("Kaifeng");
        City city11=new City("Jiaozuo");
        List<City> henancities=new ArrayList<>();
        henancities.add(city8);
        henancities.add(city9);
        henancities.add(city10);
        henancities.add(city11);

        Province guangdong=new Province("Guangdong",guangdongcities);
        Province zhejiang=new Province("Zhejiang",zhejiangcities);
        Province henan=new Province("Henan",henancities);

        provinces.add(guangdong);
        provinces.add(zhejiang);
        provinces.add(henan);








    }
}
