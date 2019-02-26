package com.aravindan.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnersIndexController {
	
	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwners() {
		return "owners/index";
	}
}
