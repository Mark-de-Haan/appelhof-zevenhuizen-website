package org.mdehaan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController
{
	@GetMapping("/")
	public String index() {
		return "index";
	}

//	@GetMapping("/admin")
}
