package br.com.spring.remember.Remember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MetalController {

	@RequestMapping(value="/metal", method= RequestMethod.GET)
	public ModelAndView directToMetal() {
		
		return new ModelAndView("metal");
	}
	
}
