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

import br.senai.bitatom.models.Medico;
import br.senai.bitatom.repository.MedicoRepository;

@RestController
@RequestMapping(value = "/api")
public class MedicoController {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@GetMapping(path = "/medico")
	public List<Medico> buscarMedico( ) {
		return medicoRepository.findAll();
	}
	
	
	@GetMapping(path = "/medico/id/{id}")
	public Optional<Medico> buscarMedicoPorId( @PathVariable(name = "id", required = true) Long id) {
		return medicoRepository.findById(id);
	}
	
	@PostMapping(path = "/medico/save")
	public void salvarMedicamento(@RequestBody Medico medico) {
		medicoRepository.save(medico);
	}
	
	
	@DeleteMapping(path = "/medico/delete/id/{id}")
	public void deleteMedico(@PathVariable(name = "id", required = true) Long id) {
		medicoRepository.deleteById(id);
	}

}
