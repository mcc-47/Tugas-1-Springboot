/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.controller;

import com.mii.server.dto.DistrictProvinceDto;
import com.mii.server.entities.Districts;
import com.mii.server.entities.Provinces;
import com.mii.server.repository.ProvinceRepository;

import com.mii.server.service.DistrictService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */
@RestController

public class DistrictController {

    @Autowired
    DistrictService districtService;

    @Autowired
    ProvinceRepository provinceRepository;

    @GetMapping("/district")
    public String index() {
        return "Hello World";
    }

    //menampilkan
    @GetMapping("/district/list")
    public List<DistrictProvinceDto> listDistrict(@RequestBody Districts district) {

        return districtService.getAllDistrict();
    }

    //insert
    @PostMapping("/district/insert")
    public String insertData(@RequestBody Districts district) {
        if (!provinceRepository.existsById(district.getProvinceId().getProvinceId())) {
            Provinces newProvince = provinceRepository.save(district.getProvinceId());
            district.setProvinceId(newProvince);
        }

        districtService.insertData(district);
        return "Data Added";
    }

    //update
//    @PutMapping("/district/update/{id}")
//    public String updateDistrict(@PathVariable Integer id, @RequestBody Districts district){
//        district.setDistrictId(district.getDistrictId());
//        district.setDistrictName(district.getDistrictName());
//        district.setKab(district.getKab());
//        district.setProvinceId(district.getProvinceId());
//        return "Update District";
//    }
    @PutMapping("/district/update/{id}")
    public String updateDistrict(@PathVariable Integer id, @RequestBody Districts district) {
        districtService.getById(id);
        districtService.updateDistrict(id, district);
        return "updated Province";
    }

    @DeleteMapping("/district/delete/{id}")
    public String deleteDistrict(@PathVariable Integer id) {
        districtService.deleteDistrict(id);
        return "District Deleted";
    }
}
