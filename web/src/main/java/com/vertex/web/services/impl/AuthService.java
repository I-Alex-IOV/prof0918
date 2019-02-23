package com.vertex.web.services.impl;

import com.vertex.web.models.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements com.vertex.web.services.AuthService {

    @Override
    public boolean isAdmin(User user) {
        return user.getName().contains("admin");
    }
}
