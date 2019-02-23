package com.vertex.web.controllers;

import com.vertex.web.models.User;
import com.vertex.web.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/security_check")
    public ModelAndView checkSecurity(@ModelAttribute("user") @Valid User user) {

        System.out.println("Username: " + user.getName() + " Password: " + user.getPassword());

        ModelAndView toReturn = new ModelAndView();
        String nextJsp = getNextJsp(user);

        toReturn.setViewName(nextJsp);
        toReturn.addObject("user", user);

//        toReturn.addObject()

        return toReturn;
    }

    private String getNextJsp(User user) {
        return authService.isAdmin(user) ? "adminResults" : "mudResults";
    }
}
