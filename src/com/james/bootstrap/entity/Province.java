package com.james.bootstrap.entity;

import java.util.List;

public class Province {

private String provincename;
private List<City> cities;

    public Province() {
    }

    public Province(String provincename, List<City> cities) {
        this.provincename = provincename;
        this.cities = cities;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
