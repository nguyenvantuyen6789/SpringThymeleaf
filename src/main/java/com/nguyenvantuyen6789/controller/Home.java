package com.nguyenvantuyen6789.controller;

import com.nguyenvantuyen6789.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Home {

    @RequestMapping("home")
    public String home(Model model) {
        model.addAttribute("message", "Success!");

        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person(1, "Tuyên Nguyễn"));
        listPerson.add(new Person(2, "Hùng Nguyễn"));
        listPerson.add(new Person(3, "Ngọc Nguyễn"));

        model.addAttribute("listPerson", listPerson);

        return "trang-chu";
    }
}
