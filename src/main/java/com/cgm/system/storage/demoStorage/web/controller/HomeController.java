package com.cgm.system.storage.demoStorage.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView homePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("/home");
        model.addObject("metaTitle", "Home | DemoStorage");
        return model;
    }
}
