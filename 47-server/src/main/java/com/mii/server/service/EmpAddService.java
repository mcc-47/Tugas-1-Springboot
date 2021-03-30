/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.service;

import com.mii.server.dto.EmpAddDto;
import com.mii.server.entities.Employees;
import com.mii.server.repository.EmpAddRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public class EmpAddService {

    @Autowired
    EmpAddRepository empAddRepository;

    public List<EmpAddDto> getAll() {
        List<EmpAddDto> ema = new ArrayList<>();
        for (Employees e : empAddRepository.findAll()) {
            EmpAddDto ea = new EmpAddDto(
                    e.getEmployeeName(),
                    e.getAddresses().getStreet1(),
                    e.getAddresses().getVillageId().getVillageName(),
                    e.getAddresses().getVillageId().getZipCode(),
                    e.getAddresses().getVillageId().getSubdistrictId().getSubdistrictName(),
                    e.getAddresses().getVillageId().getSubdistrictId().getDistrictId().getKab(),
                    e.getAddresses().getVillageId().getSubdistrictId().getDistrictId().getDistrictName(),
                    e.getAddresses().getVillageId().getSubdistrictId().getDistrictId().getProvinceId().getProvinceName());
            ema.add(ea);
        }
        return ema;

    }
}
