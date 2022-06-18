package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class HelloController {
    @RequestMapping
    public String homePage(){
        return "home_page";
    }

    @RequestMapping("/showForm")
    public String showForm(){
        return "form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "form_confirmation";
    }

    @RequestMapping("/processFormTwo")
    public String processFormTwo(@RequestParam("studentName")String name, Model model){
        String result = name.toUpperCase();

        model.addAttribute("message", result);

        return "form_confirmation";
    }
}