package br.com.zup.bancozup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // informa que é uma classe rest
public class StatusController {
	//metodo para testar servidor
	
	@GetMapping(path="/api/status")
	public String check() {
		return "online";
	}
	

}
