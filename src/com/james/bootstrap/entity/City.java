package com.james.bootstrap.entity;

public class City {

    private String cityname;

    public City() {
    }

    public City(String cityname) {
        this.cityname = cityname;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
}
