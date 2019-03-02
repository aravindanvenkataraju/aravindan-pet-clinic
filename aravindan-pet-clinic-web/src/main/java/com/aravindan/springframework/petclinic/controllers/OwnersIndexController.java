package com.aravindan.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aravindan.springframework.petclinic.services.OwnerService;
@RequestMapping("/owners")
@Controller
public class OwnersIndexController {
	
	private final OwnerService ownerService;
	
	
	public OwnersIndexController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}


	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}
}
