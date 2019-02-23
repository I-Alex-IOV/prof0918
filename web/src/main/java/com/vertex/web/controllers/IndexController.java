package com.vertex.web.controllers;

import com.vertex.web.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class IndexController {

    @GetMapping("/")
    public ModelAndView user() {
        ModelAndView modelAndView = new ModelAndView();

        User user = new User();
        System.out.println(user);

        modelAndView.addObject("user", user);
        modelAndView.setViewName("index");
        return modelAndView;
    }


}
