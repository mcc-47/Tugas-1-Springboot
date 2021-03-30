/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.service;

import com.mii.server.entities.Provinces;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mii.server.repository.ProvinceRepository;

/**
 *
 * @author acer
 */
@Service
public class ProvinceService {

    @Autowired
    ProvinceRepository provinceRepository;

    //Read -> Select
    public List<Provinces> getAll() {
        return provinceRepository.findAll();
    }

    //insert
    public Provinces insertData(Provinces province) {
        
        return provinceRepository.save(province);

    }

    //Update -> Update
//    public void update(Integer id, Provinces province) {
//        Provinces provinces = provinceRepository.findById(id).get();
//        province.getProvinceName();
//        provinceRepository.save(provinces);
//    }
    
    public void update(Integer id, Provinces provinces) {
        Provinces province = provinceRepository.findById(id).get();
        province.setProvinceName(provinces.getProvinceName());
        provinceRepository.save(province);
    }
    
    //Delete -> Delete
    public boolean delete(Integer id) {
        provinceRepository.deleteById(id);
        return provinceRepository.existsById(id);
    }
    
    public void getById(Integer id){
        provinceRepository.getOne(id);
    }

}
