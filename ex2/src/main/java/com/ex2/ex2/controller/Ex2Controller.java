package com.ex2.ex2.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex2")
public class Ex2Controller {
	
	@GetMapping
	public String aprendizagem() {
		return "Melhorar minha Comunicão e interação com os colegas de sala e grupo do PI";
	}
	
}
