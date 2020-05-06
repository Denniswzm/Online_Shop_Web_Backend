package com.lexframe.online_shop_web.controller;

import com.lexframe.online_shop_web.dao.LoginDao;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthorizationController {
    private AuthenticationManager authenticationManager;

    public AuthorizationController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginDao loginDao) {
        try {
            Authentication auth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDao.getUsername(), loginDao.getPassword()));
            if (auth.isAuthenticated())
                return ResponseEntity.ok("success");
        } catch (AuthenticationException e) {
        }
        return ResponseEntity.status(401).body("failed");
    }
}
