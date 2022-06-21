/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ap.portfolio.security.service;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ap.portfolio.security.enums.RoleName;
import com.ap.portfolio.security.model.Role;
import com.ap.portfolio.security.repository.RoleRepository;

@Service
@Transactional
public class RoleService {
     @Autowired
    RoleRepository roleRepository;

    public Optional<Role> getByRoleName(RoleName rolename){
        return roleRepository.findByRoleName(rolename);
    }

    public void save(Role role){
        roleRepository.save(role);
    }
}
