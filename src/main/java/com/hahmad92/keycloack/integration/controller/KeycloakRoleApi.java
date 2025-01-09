package com.hahmad92.keycloack.integration.controller;

import com.hahmad92.keycloack.integration.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class KeycloakRoleApi {

    @Autowired
    private RoleService roleService;


    @PutMapping("/assign-role/user/{userId}")
    public ResponseEntity<?>  assignRole(@PathVariable String userId, @RequestParam String roleName){

        roleService.assignRole(userId, roleName);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
