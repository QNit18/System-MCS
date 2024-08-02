package com.qnit18.identity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qnit18.identity.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {}
