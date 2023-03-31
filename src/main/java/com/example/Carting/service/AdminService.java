package com.example.Carting.service;

import com.example.Carting.model.Admin;

public interface AdminService {
    Admin createAdmin(Admin admin);
    Admin findByUsername(String username);

    Admin findByEmail(String email);

    void deleteAdmin(String username);
    Admin updateAdmin(Admin admin);
}
