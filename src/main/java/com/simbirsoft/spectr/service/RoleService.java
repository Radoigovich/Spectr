package com.simbirsoft.spectr.service;

import com.simbirsoft.spectr.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(int id);
    void saveOrUpdateRole(Role role);
    void deleteRoleById(int id);
}
