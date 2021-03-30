/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.service;

import com.mii.server.dto.RegistDto;
import com.mii.server.entities.Addresses;
import com.mii.server.entities.Contactes;
import com.mii.server.entities.Educations;
import com.mii.server.entities.Employees;
import com.mii.server.entities.Majors;
import com.mii.server.entities.Universitys;
import com.mii.server.entities.Villages;
import com.mii.server.repository.RegistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public class RegistService {

    @Autowired
    RegistRepository registReposity;

    public Employees insertData(RegistDto registDto) {
        Employees reg = new Employees(
                registDto.getPrefix(),
                registDto.getEmployeeId(),
                registDto.getEmployeeName(),
                registDto.getBirthDate(),
                registDto.getGender(),
                registDto.getEmail(),
                //registDto.getPrefix(), registDto.getEmployeeId(), new Villages(registDto.getVillageId()
                new Addresses(registDto.getPrefix(), registDto.getEmployeeId(), new Villages(registDto.getVillageId())),
                new Educations(registDto.getEmployeeId(), new Majors(registDto.getMajorId()), new Universitys(registDto.getUniversityId()), registDto.getPrefix()),
                new Contactes(registDto.getEmployeeId(), registDto.getPhone(), registDto.getLinkedin(), registDto.getPrefix()));
        return registReposity.save(reg);
    }

}
