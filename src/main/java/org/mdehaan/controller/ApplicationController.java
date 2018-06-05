package org.mdehaan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController
{
    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("active_menu", "index");
        return "index";
    }

    @GetMapping("/agenda")
    public String agenda(Model model)
    {
        model.addAttribute("active_menu", "agenda");
        return "agenda";
    }
}
