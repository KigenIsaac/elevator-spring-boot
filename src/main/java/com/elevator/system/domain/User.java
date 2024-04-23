package com.elevator.system.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private String UserId;
    private String Username, Role,  Password, RegionID;

    public User(String userId, String username, String role, String password, String region) {
        UserId = userId;
        Username = username;
        Role = role;
        Password = password;
        RegionID = region;
    }

    public User() {
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRegionID() {
        return RegionID;
    }

    public void setRegionID(String region) {
        RegionID = region;
    }
}
