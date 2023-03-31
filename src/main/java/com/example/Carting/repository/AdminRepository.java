package com.example.Carting.repository;

import com.example.Carting.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
    Admin findAdminByUsername(String username);
    Admin findAdminByEmail(String email);
}
