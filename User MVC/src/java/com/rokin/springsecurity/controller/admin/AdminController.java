/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.springsecurity.controller.admin;

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
    
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    @ResponseBody
    public String admin()
    {
        return "adminPage";
    }
}
