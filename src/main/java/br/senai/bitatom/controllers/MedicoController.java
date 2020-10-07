package br.senai.bitatom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<Medico> buscarMedicoPorId(@PathVariable(name = "id", required = true) Long idMedico ) {
		return medicoRepository.findAll();
	}

}
