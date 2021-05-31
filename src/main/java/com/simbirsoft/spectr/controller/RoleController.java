package com.simbirsoft.spectr.controller;

import com.simbirsoft.spectr.entity.Message;
import com.simbirsoft.spectr.entity.Role;
import com.simbirsoft.spectr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {
    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/roles")
    public List<Role> getRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/roles/{id}")
    public Role getRoleById(@PathVariable int id) {
        return roleService.getRoleById(id);
    }

    @PostMapping("/roles")
    public String saveRole(@RequestBody Role role){
        roleService.saveOrUpdateRole(role);
        return "Role saved";
    }

    @DeleteMapping("/roles/{id}")
    public String deleteRole(@PathVariable int id) {
        roleService.deleteRoleById(id);
        return "Role ID = " + id + " was deleted.";
    }
}
