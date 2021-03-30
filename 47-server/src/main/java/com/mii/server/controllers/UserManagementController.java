/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.controllers;

import com.mii.server.dtos.UserManagementDTO;
import com.mii.server.entities.Employees;
import com.mii.server.services.UserManagementService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ROG
 */
@RestController
@ResponseBody
@RequestMapping("usermanagement")
public class UserManagementController {
    
    @Autowired
    UserManagementService userManagementService;
    
    @PostMapping("/insert")
    public String insert(@RequestBody UserManagementDTO userManagementDTO){
        userManagementService.insertData(userManagementDTO);
        return "Data Inserted";
    }
}
