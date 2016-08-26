/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.springsecurity.controller.admin;

import com.rokin.springsecurity.dao.UserDAO;
import com.rokin.springsecurity.entity.User;
import java.time.Instant;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author rokin
 */


@Controller
public class AdminController {
    
    
    @Autowired
    private UserDAO userDAO; 
    
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    @ResponseBody
    public String admin()
    {
        userDAO.insert(new User("emma", "watson", "Emma", "Watson", new Date() , "London", "Female"));
        
        return "adminPage";
    }
}
