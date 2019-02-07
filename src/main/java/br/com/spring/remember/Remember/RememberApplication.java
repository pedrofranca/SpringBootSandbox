package br.com.spring.remember.Remember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("br.com.spring.remember.Remember.controllers")
@SpringBootApplication
@RestController
public class RememberApplication extends SpringBootServletInitializer {
	
	@RequestMapping("/")
	public String home() {
		return "Spring application Deployed!";
	}
	
	/*public static void main(String[] args) {
		SpringApplication.run(RememberApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RememberApplication.class);
	}*/
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RememberApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RememberApplication.class, args);
	}
	
}
