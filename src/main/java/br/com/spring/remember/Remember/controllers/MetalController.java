package br.com.spring.remember.Remember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MetalController {

	@RequestMapping(value="/metal", method= RequestMethod.GET)
	public String directToMetal() {
		
		return "metal";
	}
	
}