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
        model.addAttribute("active_menu_item", "home");
        return "home";
    }

    @GetMapping("/events")
    public String events(Model model)
    {
        model.addAttribute("active_menu_item", "events");
        return "events";
    }

    @GetMapping("/about")
    public String about(Model model)
    {
        model.addAttribute("active_menu_item", "about");
        return "about";
    }

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }
}
