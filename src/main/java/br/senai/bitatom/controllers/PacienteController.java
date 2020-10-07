package br.senai.bitatom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<Paciente> buscarPacientePorId( ) {
		return pacienteRepository.findAll();
	}
	
}
