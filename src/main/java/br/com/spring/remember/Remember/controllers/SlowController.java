package br.com.spring.remember.Remember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SlowController {
	
	@RequestMapping(value="/slow", method= RequestMethod.GET)
	public ModelAndView directToSlow() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("slow");
		
		return mv;
	}
	
}
