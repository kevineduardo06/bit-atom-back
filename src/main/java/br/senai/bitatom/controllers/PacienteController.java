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

import br.senai.bitatom.models.Paciente;
import br.senai.bitatom.repository.PacienteRepository;



@RestController
@RequestMapping(value = "/api")
public class PacienteController {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@GetMapping(path = "/paciente")
	public List<Paciente> buscarPaciente( ) {
		return pacienteRepository.findAll();
	}
	
	@GetMapping(path = "/paciente/id/{id}")
	public Optional<Paciente> buscarPacientePorId( @PathVariable(name = "id", required = true) Long id) {
		return pacienteRepository.findById(id);
	}
	
	@PostMapping(path = "/paciente/save")
	public void salvarMedicamento(@RequestBody Paciente paciente) {
		pacienteRepository.save(paciente);
	}
	
	@DeleteMapping(path = "/paciente/delete/id/{id}")
	public void deletePaciente(@PathVariable(name = "id", required = true) Long id) {
		pacienteRepository.deleteById(id);
	}
	
}
