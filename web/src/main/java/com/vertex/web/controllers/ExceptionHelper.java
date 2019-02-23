package com.vertex.web.controllers;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHelper {

    @ExceptionHandler(value = BindException.class)
//    @ResponseBody
    public ModelAndView handleValidation(BindException exception) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("index");
        modelAndView.addObject(exception.getBindingResult().getModel());
        modelAndView.addObject("user", exception.getTarget());

        return modelAndView;
    }
}
