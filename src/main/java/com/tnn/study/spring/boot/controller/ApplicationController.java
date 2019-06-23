package com.tnn.study.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController
{
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginpage(@RequestParam(value = "error", required = false) String error) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Authentication failed!");
        }
        model.setViewName("login");
        return model;
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public ModelAndView homepage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("home");
        return model;
    }
}
