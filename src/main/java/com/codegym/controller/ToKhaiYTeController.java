package com.codegym.controller;

import modules.ToKhaiYTe;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.ToKhaiYTeService;

@Controller
public class ToKhaiYTeController {
    ToKhaiYTeService toKhaiYTeService = new ToKhaiYTeService();

    @RequestMapping("home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("list", toKhaiYTeService.list);
        return modelAndView;
    }

    @PostMapping("create")
    public String create(@ModelAttribute ToKhaiYTe toKhaiYTe){
        toKhaiYTeService.save(toKhaiYTe);
        return "redirect:/home";
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("list", new ToKhaiYTe());
        return modelAndView;
    }

}
