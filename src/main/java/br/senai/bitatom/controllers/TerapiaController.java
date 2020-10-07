package br.senai.bitatom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.bitatom.models.Terapia;
import br.senai.bitatom.repository.TerapiaRepository;

@RestController
@RequestMapping(value = "/api")
public class TerapiaController {

	@Autowired
	private TerapiaRepository terapiaRepository;
	
	@GetMapping(path = "/terapia")
	public List<Terapia> buscarTerapiaPorId(@PathVariable(name = "id", required = true) Long idTerapia ) {
		return terapiaRepository.findAll();
	}
	
	
}
