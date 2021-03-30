/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.controller;

import com.mii.server.entities.Provinces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.mii.server.service.ProvinceService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
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

public class ProvinceController {

    @Autowired
    ProvinceService provinceService;

    @GetMapping("/")
    public String index() {
        System.out.println("Hello WORLD!");
        return "index";
    }

    @GetMapping("/province/list")
    public List<Provinces> listProvince() {
        for (Provinces provinces : provinceService.getAll()) {
            System.out.printf(String.format("id: %d ", provinces.getProvinceId()));
            System.out.printf(String.format("name: %s", provinces.getProvinceName()));
        }
        return provinceService.getAll();
    }

    @PostMapping("/province/insert")
    public String insertProvince(@RequestBody Provinces province) {
        provinceService.insertData(province);
        return "Data Added";
    }

//    @PutMapping("/province/update/{id}")
//    public String updateProvince(@PathVariable Integer id, @RequestBody Provinces province) {
//        province.setProvinceId(province.getProvinceId());
//        province.setProvinceName(province.getProvinceName());
//
//        return "Update Provinces";
//    }
    
    @PutMapping("/province/update/{id}")
    public String updateProvince(@PathVariable Integer id,@RequestBody Provinces provinces){
        provinceService.getById(id);
        provinceService.update(id,provinces);
        return "updated Province";
    }

    @DeleteMapping("/province/delete/{id}")
    public String deleteProvince(@PathVariable Integer id) {
        provinceService.delete(id);
        return "Delete province"; //localhost:8080/
    }

}
