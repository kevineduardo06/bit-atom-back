package br.senai.bitatom.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.senai.bitatom.models.Medico;
import br.senai.bitatom.repository.MedicoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class MedicoService {

	@Autowired
	private MedicoRepository medicoRepository;
	
	
	public Collection<Medico> buscarTodos(){
		return this.medicoRepository.findAll();
	}

	public Optional<Medico> buscarPorId(Long id){
		return this.medicoRepository.findById(id);
	}

	public Medico salvar(Medico medico){
		return this.medicoRepository.save(medico);

	}

	public void delete(Long id){


		Optional<Medico> medico = this.medicoRepository.findById(id);
		medico.ifPresent(value -> this.medicoRepository.delete(value));
	}

}
