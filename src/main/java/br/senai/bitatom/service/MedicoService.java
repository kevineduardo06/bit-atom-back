package br.senai.bitatom.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.senai.bitatom.models.Medico;
import br.senai.bitatom.repository.MedicoRepository;

public class MedicoService {

	@Autowired
	private MedicoRepository medicoRepository;
	
	
	public void cadastroMedico(Medico medico){
		medicoRepository.saveAndFlush(medico);
	}
	
	
}
