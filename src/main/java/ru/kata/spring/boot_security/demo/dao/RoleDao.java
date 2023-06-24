package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getAllRoles();
    Role findByName(String name);
    void saveRole(Role role);

    Role findById(Long id);
}
