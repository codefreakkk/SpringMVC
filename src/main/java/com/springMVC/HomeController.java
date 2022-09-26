package com.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    // using model
    @RequestMapping(value = "/home")
    public String home(Model model) {
        model.addAttribute("name", "harsh");
        return "index";
    }

    //using modelandview
    @RequestMapping(value = "/about")
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "harsh");
        modelAndView.setViewName("about");
        return modelAndView;
    }
}