package com.springBootJPA.controller;

import com.springBootJPA.model.Developer;
import com.springBootJPA.model.dao.DeveloperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DevController {

  @Autowired
  DeveloperRepo developerRepo;

  @RequestMapping("addDeveloper")
  public ModelAndView addDeveloper(Developer dev){
    developerRepo.save(dev);
    ModelAndView mv = new ModelAndView();
    mv.addObject("obj", dev);
    String message = "Developer was added successfully";
    mv.addObject("message", message);
    mv.setViewName("pages/developers");
    return mv;
  }

  @RequestMapping("getDeveloper")
  public ModelAndView getDeveloper(int id){
    //Developer developer = developerRepo.findById(id).orElse(new Developer());
    Developer developer = developerRepo.findById(id).orElse(new Developer());
    ModelAndView mv = new ModelAndView();
    mv.addObject("obj", developer);
    String message = "Search result:";
    mv.addObject("message", message);
    mv.setViewName("pages/developers");
    return mv;
  }


  @RequestMapping("findByLangDeveloper")
  public ModelAndView findByLangDeveloper(String lang){
    System.out.println(lang);
    List<Developer> result = developerRepo.findByLang(lang);
    ModelAndView mv = new ModelAndView("pages/findByLang");
    String message = "Search by lang result:";
    mv.addObject("message", message);
    mv.addObject("result", result);
    return mv;
  }

  @RequestMapping("findAllWithIdGreaterThan")
  public ModelAndView findAllWithIdGreaterThan(int id){
    List<Developer> result = developerRepo.findByIdGreaterThan(id);
    ModelAndView mv = new ModelAndView("pages/findByLang");
    String message = "Search findAllWithIdGreaterThan result:";
    mv.addObject("message", message);
    mv.addObject("result", result);
    return mv;
  }

}
