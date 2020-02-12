package com.cristian.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/tips")
    public String tips(){
        return "tips";
    }
    @RequestMapping("/gallery")
    public String gallery(){
        return "gallery";
    }
    @RequestMapping("/contactUs")
    public String contactUs(){
        return "contactUs";
    }
}

