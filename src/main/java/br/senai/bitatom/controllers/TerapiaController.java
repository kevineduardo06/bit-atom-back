package br.senai.bitatom.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TerapiaController {

	@GetMapping(path = "api/terapia-id/{}")
	public void buscarTerapiaPorId() {
		
	}
	
	
}
