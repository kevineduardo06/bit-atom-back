package br.senai.bitatom.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<Terapia> buscarTerapiaPorId() {
		return terapiaRepository.findAll();
	}
	
	
	@GetMapping(path = "/terapia/id/{id}")
	public Optional<Terapia> buscarTerapia( @PathVariable(name = "id", required = true) Long id) {
		return terapiaRepository.findById(id);
	}
	
	@PostMapping(path = "/terapia/save")
	public void salvarTerapia(@RequestBody Terapia terapia) {
		terapiaRepository.save(terapia);
	}
	
	@DeleteMapping(path = "/terapia/delete/id/{id}")
	public void deleteTerapia(@PathVariable(name = "id", required = true) Long id) {
		terapiaRepository.deleteById(id);
	}


	
}
