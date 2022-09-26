package com.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/more")
public class DemoController {

    @RequestMapping(path ="/info", method = RequestMethod.GET)
    public String info() {
        return "info";
    }
}
