package br.com.spring.remember.Remember.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MusicController {
	
	@RequestMapping(value="/music", method= RequestMethod.GET)
	public String directToMusic() {
		
		return "music";
	}
	
}
