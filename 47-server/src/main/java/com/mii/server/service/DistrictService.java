/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.service;

import com.mii.server.dto.DistrictProvinceDto;
import com.mii.server.entities.Districts;
import com.mii.server.entities.Provinces;
import com.mii.server.repository.DistrictRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public class DistrictService {

    @Autowired
    DistrictRepository districtRepository;

    //read
    public List<DistrictProvinceDto> getAllDistrict() {

        List<DistrictProvinceDto> pds = new ArrayList<>();
        for (Districts d : districtRepository.findAll()) {
            DistrictProvinceDto ds = new DistrictProvinceDto(
                    d.getDistrictName(),
                    d.getProvinceId().getProvinceName());
            pds.add(ds);
        }
        return pds;

    }

    //create atau insert
    public Districts insertData(Districts district) {

        return districtRepository.save(district);

    }

    //update
//    public void updateDistrict(Integer id, Districts district) {
//        Districts districts = districtRepository.findById(id).get();
//        districts.getDistrictName();
//        district.getKab();
//        district.getProvinceId();
//        districtRepository.save(districts);
//    }
    
    public void updateDistrict(Integer id, Districts districts) {
        Districts district = districtRepository.findById(id).get();
        district.setDistrictName(districts.getDistrictName());
        district.setKab(districts.getKab());
        district.setProvinceId(districts.getProvinceId());
        districtRepository.save(district);
    }

    //delete
    public boolean deleteDistrict(Integer id) {
        districtRepository.deleteById(id);
        return districtRepository.existsById(id);
    }

    public void getById(Integer id) {
        districtRepository.getOne(id);
    }
}
