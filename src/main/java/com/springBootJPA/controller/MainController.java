package com.springBootJPA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @RequestMapping("/")
  public ModelAndView home(){
    ModelAndView mv = new ModelAndView();
    mv.setViewName("home");
    return mv;
  }

//  @RequestMapping("home")
//  public String home2(){
//    System.out.println("__home");
//    return "home";
//  }

//  @RequestMapping("home")
//  public ModelAndView home2(){
//    String name = "maks";
//    ModelAndView mv = new ModelAndView();
//    mv.addObject("name", name);
//    mv.setViewName("home");
//    return mv;
//  }



//  @RequestMapping("home")
//  public ModelAndView home(){
//    String name = "maks";
//    ModelAndView mv = new ModelAndView();
//    mv.addObject("name", name);
//    mv.setViewName("home");
//    return mv;
//  }


}
