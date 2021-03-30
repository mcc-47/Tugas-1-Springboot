/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.dtos;

import java.util.Date;

/**
 *
 * @author MyLaptop
 */
public class UserManagementDTO {
    private String prefix;
    private Integer employeeId;
    private String employeeName;
    private Date birthDate;
    private String gender;
    private String email;
    private Integer addressId;
    private String street1;
    private String street2;
    private Integer villageId;
    private String villageName;
    private String zipCode;
    private Integer subdistrictId;
    private String subdistrictName;
    private String kab;
    private Integer districtId;
    private String districtName;
    private Integer provinceId;
    private String provinceName;
    private Integer contactId;
    private String phone;
    private String linkedin;
    private Integer educationId;
    private String degree;
    private Integer majorId;
    private String majorName;
    private Integer universityId;
    private String universityName;

    public UserManagementDTO(String prefix, Integer employeeId, String employeeName, Date birthDate, String gender, String email, Integer addressId, String street1, String street2, Integer villageId, String villageName, String zipCode, Integer subdistrictId, String subdistrictName, String kab, Integer districtId, String districtName, Integer provinceId, String provinceName, Integer contactId, String phone, String linkedin, Integer educationId, String degree, Integer majorId, String majorName, Integer universityId, String universityName) {
        this.prefix = prefix;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
        this.addressId = addressId;
        this.street1 = street1;
        this.street2 = street2;
        this.villageId = villageId;
        this.villageName = villageName;
        this.zipCode = zipCode;
        this.subdistrictId = subdistrictId;
        this.subdistrictName = subdistrictName;
        this.kab = kab;
        this.districtId = districtId;
        this.districtName = districtName;
        this.provinceId = provinceId;
        this.provinceName = provinceName;
        this.contactId = contactId;
        this.phone = phone;
        this.linkedin = linkedin;
        this.educationId = educationId;
        this.degree = degree;
        this.majorId = majorId;
        this.majorName = majorName;
        this.universityId = universityId;
        this.universityName = universityName;
        
        
    }

    public String getPrefix() {
        return prefix;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public String getStreet1() {
        return street1;
    }

    public String getStreet2() {
        return street2;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public String getVillageName() {
        return villageName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Integer getSubdistrictId() {
        return subdistrictId;
    }

    public String getSubdistrictName() {
        return subdistrictName;
    }

    public String getKab() {
        return kab;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public Integer getContactId() {
        return contactId;
    }

    public String getPhone() {
        return phone;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public Integer getEducationId() {
        return educationId;
    }

    public String getDegree() {
        return degree;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public Integer getUniversityId() {
        return universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    
}