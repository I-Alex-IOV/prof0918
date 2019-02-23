package com.vertex.web.services;

import com.vertex.web.models.User;

public interface AuthService {
    boolean isAdmin(User user);
}
