package org.mdehaan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AuthenticationController {

    @PostMapping("/authenticate")
    public String login(@Valid @ModelAttribute String password)
    {
        System.out.println("password = " + password);
        return "home";
    }
}
