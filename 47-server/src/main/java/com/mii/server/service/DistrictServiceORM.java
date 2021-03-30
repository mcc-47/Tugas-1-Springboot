/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.service;

import com.mii.server.dtos.ProvinceDistrictDTO;
import com.mii.server.entity.Districts;
import com.mii.server.repositories.DistrictRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MyLaptop
 */
@Service
public class DistrictServiceORM {
    @Autowired
    DistrictRepository districtRepository;
    
//    public List<ProvinceDistrictDTO> getProvinceDistrictName(){
//        districtRepository.findAll();
//        List<ProvinceDistrictDTO> pds = new ArrayList<>();
//        for (Districts d : districtRepository.findAll()) {
//            ProvinceDistrictDTO pd = new ProvinceDistrictDTO(
//                    d.getDistrictName(), d.getProvinceId().getProvinceName()
//            );
//            pds.add(pd);
//        }
//        return pds;
//    } 
}
