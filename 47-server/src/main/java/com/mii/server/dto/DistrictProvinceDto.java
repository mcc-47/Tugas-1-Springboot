/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.dto;

import com.mii.server.entities.Provinces;

/**
 *
 * @author acer
 */
public class DistrictProvinceDto {

    private String name;
    private String provinceId;

    public DistrictProvinceDto(String name, String provinceId) {

        this.name = name;
        this.provinceId = provinceId;
    }

    public DistrictProvinceDto() {

    }

    public String getName() {
        return name;
    }

    public String getProvinceId() {
        return provinceId;
    }

}
