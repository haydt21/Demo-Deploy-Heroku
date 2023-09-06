package com.haydt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haydt.bean.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
