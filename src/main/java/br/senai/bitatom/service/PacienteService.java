package br.senai.bitatom.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.senai.bitatom.models.Paciente;
import br.senai.bitatom.repository.PacienteRepository;

public class PacienteService {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	
	
	public void cadastroPaciente(Paciente paciente) {
		pacienteRepository.saveAndFlush(paciente);
	}
	
	
	
	
}
