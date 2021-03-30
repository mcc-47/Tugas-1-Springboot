/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.controller;

import com.mii.server.dto.EmpAddDto;
import com.mii.server.service.EmpAddService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author acer
 */
@RestController
@RequestMapping("/empall")
public class EmpAddController {
    
    @Autowired
    EmpAddService empAddService;
    
    @PostMapping("")
    public List<EmpAddDto> list(){
        return empAddService.getAll();
    }
}
