/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mii.server.services;

import com.mii.server.entities.Users;
import com.mii.server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author ROG
 */
@Service
public class UserDetailService implements UserDetailsService{

    @Autowired
    UserRepository userRepository;
    
    @Override
    public Users loadUserByUsername(String userName) throws UsernameNotFoundException {
        Users users = userRepository.findByUserName(userName);
        if(userRepository == null) {
            throw new UsernameNotFoundException(userName + "Not Found");
        }
            return users;
    }
    
    public boolean loadByUserName(String userName) {
        Users user = userRepository.findByUserName(userName);
        if (user == null) {
            throw new UsernameNotFoundException("username not found");
//            return false;
        } else {
            return true;
        }
    }
    
    
    
}
