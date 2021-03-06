package br.senai.bitatom.service;

import br.senai.bitatom.models.Paciente;
import org.springframework.beans.factory.annotation.Autowired;

import br.senai.bitatom.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class PacienteService {

	@Autowired
	private PacienteRepository pacienteRepository;




	public Optional<Paciente> buscarPorId(Long id){
		return this.pacienteRepository.findById(id);
	}

	public Paciente salvar(Paciente paciente ){
		return this.pacienteRepository.save(paciente);

	}

	public void delete(Long id){


		Optional<Paciente> paciente = this.pacienteRepository.findById(id);
		paciente.ifPresent(value -> this.pacienteRepository.delete(value));
	}
	
	public Long logar(Paciente paciente){

		Optional<Paciente> consultado = this.pacienteRepository.findByEmailAndSenha(paciente.getEmail(), paciente.getSenha());
			return consultado.isPresent() ? consultado.get().getId() : null;
	}

	
	
	
	
}
