package br.senai.bitatom.service;

import br.senai.bitatom.models.Medicamento;
import br.senai.bitatom.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import br.senai.bitatom.models.Terapia;
import br.senai.bitatom.repository.TerapiaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class TerapiaService {

	@Autowired
	private TerapiaRepository terapiaRepository;


	public Collection<Terapia> buscarTodos(){
		return this.terapiaRepository.findAll();
	}

	public Optional<Terapia> buscarPorId(Long id){
		return this.terapiaRepository.findById(id);
	}

	public Terapia salvar(Terapia terapia ){
		return this.terapiaRepository.save(terapia);

	}

	public void delete(Long id){


		Optional<Terapia> terapia = this.terapiaRepository.findById(id);
		terapia.ifPresent(value -> this.terapiaRepository.delete(value));
	}
}
