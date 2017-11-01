package com.example.skm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song", new Song());
        return "songform";
    }

    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song, Model model){
        model.addAttribute("song", song);
        return "confirmsong";
    }
}