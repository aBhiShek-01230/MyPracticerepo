package com.example.model;

public class AuthRequest {
    private String username;
    private String password;

    // ✅ Add public getter methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // (Optional) Add setters if needed
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // (Optional) Add constructor
    public AuthRequest() {}

    public AuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
