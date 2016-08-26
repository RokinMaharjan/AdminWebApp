/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.springsecurity.dao;

import com.rokin.springsecurity.entity.User;
import java.util.List;

/**
 *
 * @author rokin
 */
public interface UserDAO {
    List<User> getAll();
    User getByUsername(String username);
    void insert(User user);
    void update(User user);
    void delete(User user);
     
}
