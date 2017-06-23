package com.example.selenide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SelenideApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelenideApplication.class, args);
	}

	@GetMapping("/test")
	@ResponseBody
	public String index() {
		return "OK!";
	}
}
