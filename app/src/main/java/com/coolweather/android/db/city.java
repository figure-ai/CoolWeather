package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by anwser_mac on 2017/4/26.
 */

public class city extends DataSupport{

    private int id;

    private String cityName;

    private int provinceId;

    private int cityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
