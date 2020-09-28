package com.cozla.demo;

import com.cozla.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", new User("Mano").getName());

        return "index";
    }
}