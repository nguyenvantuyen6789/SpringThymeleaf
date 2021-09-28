package com.nguyenvantuyen6789.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

    @RequestMapping("home")
    public String home(Model model) {
        model.addAttribute("message", "Success!");
        return "trang-chu";
    }
}
