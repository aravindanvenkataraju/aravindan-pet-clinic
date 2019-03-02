package com.aravindan.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aravindan.springframework.petclinic.services.VetService;
@RequestMapping("/vets")
@Controller
public class VetsIndexController {
	
	private final VetService vetService;
	
	public VetsIndexController(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@RequestMapping({"", "/", "/index", "/index.html"})
	public String listVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
}
