package com.springMVC;

import com.springMVC.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    // model attribute example
    @RequestMapping(path = "/processcontact", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model) {
        model.addAttribute(user);
        return "success";
    }


    // without model object
//    @RequestMapping(path = "/processcontact", method = RequestMethod.POST)
//    public String handleForm(@RequestParam("name") String name, @RequestParam("age") String age, Model model) {
//
//        User user = new User();
//        user.setAge(age);
//        user.setName(name);
//
//        model.addAttribute(user);
//
//        // show this data on view
////        model.addAttribute("name", name);
////        model.addAttribute("age", age);
//        return "success";
//    }
}
