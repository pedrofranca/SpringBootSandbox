package br.com.spring.remember.Remember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicController {
	
	@RequestMapping(value="/music", method= RequestMethod.GET)
	public ModelAndView directToMusic() {
		
		return new ModelAndView("music");
	}
	
}
