package com.example.springbootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping({"", "/**/{path:[^.]*}"})
    public String redirectToIndex(){
        return "redirect:/index";
    }

    @GetMapping("/index")
    public ModelAndView getIndex(ModelAndView mav){
        mav.addObject("message", "hello, world");
        mav.setViewName("index");
        return mav;
    }

}
