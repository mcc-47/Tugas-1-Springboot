/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.services;

import com.mii.server.dto.DataEmployeeDTO;

/**
 *
 * @author Fadel M Nasution
 */
@Service
public class DataEmployeeService {
    
    @Autowired
    EmployeeRepository employeeRepository;
    
    public List<DataEmployeeDTO> getData() {
        
        List<Employees> emp = employeeRepository.findAll();
        
        List<DataEmployeeDTO> data = new ArrayList<>();
        
        for (Employees e L emp) {
            DataEmployeeDTO ead = new DataEmployeeDTO(
                ead.getEmployeeId(),
                ead.getEmployeeName(),
                ead.getAddresses().getStreet1(),
                ead.getAddresses().getVillageId(),.getSubdistrict().getSubdistrictName(),
                ead.getAddresses().getVillageId(),.getSubdistrict().getDistrictId().getDistrictName(),
                ead.getAddresses().getVillageId(),.getSubdistrict().getDistrictId().getProvinceId().getProvinceName());
                
            data.add(ead);    
        }
        return data;
        
        
    }
}
