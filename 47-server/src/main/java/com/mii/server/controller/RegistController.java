/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.controller;

import com.mii.server.dto.RegistDto;
import com.mii.server.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */
@RestController
public class RegistController {

    @Autowired
    RegistService registService;

    @PostMapping("/insert")
    public String insert(@RequestBody RegistDto registDto){
        
        registService.insertData(registDto);
        return "Data Inserted";
    }
}
