/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.dto;

/**
 *
 * @author acer
 */
public class EmpAddDto {
    
    private String employeeName;
    private String street;
    private String villageName;
    private String zipCode;
    private String subDistrictName;
    private String kab;
    private String districtName;
    private String provinceName;

    public EmpAddDto(String employeeName, String street, String villageName, String zipCode, String subDistrictName, String kab, String districtName, String provinceName) {
        this.employeeName = employeeName;
        this.street = street;
        this.villageName = villageName;
        this.zipCode = zipCode;
        this.subDistrictName = subDistrictName;
        this.kab = kab;
        this.districtName = districtName;
        this.provinceName = provinceName;
    }

    public EmpAddDto() {
    }
    

    public String getEmployeeName() {
        return employeeName;
    }

    public String getStreet() {
        return street;
    }

    public String getVillageName() {
        return villageName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getSubDistrictName() {
        return subDistrictName;
    }

    public String getKab() {
        return kab;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getProvinceName() {
        return provinceName;
    }
    
    
}