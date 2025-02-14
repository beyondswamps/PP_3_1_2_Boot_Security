package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    List<Role> getRolesByIds(List<Long> ids);

    Role findByName(String name);

    void saveRole(Role role);

    Role findById(Long id);
}
