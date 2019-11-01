package com.springBootJPA.controller;

import com.springBootJPA.model.Developer;
import com.springBootJPA.model.dao.DeveloperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DevController {

  @Autowired
  DeveloperRepo developerRepo;

  @RequestMapping("addDeveloper")
  public ModelAndView addDeveloper(Developer dev){
    developerRepo.save(dev);
    ModelAndView mv = new ModelAndView();
    mv.addObject("obj", dev);
    mv.setViewName("pages/developers");
    return mv;

  }
}
