package com.example.controller;

import com.example.model.AuthRequest;
import com.example.model.AuthResponse;
import com.example.util.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        if ("user".equals(request.getUsername()) && "password".equals(request.getPassword())) {
            String token = JwtUtil.generateToken(request.getUsername());
            return new AuthResponse(token);
        } else {
            throw new RuntimeException("Invalid username or password");
        }
    }
}
