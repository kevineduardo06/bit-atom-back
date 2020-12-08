package br.senai.bitatom.service;

import br.senai.bitatom.models.Medicamento;
import org.springframework.beans.factory.annotation.Autowired;

import br.senai.bitatom.repository.MedicamentoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class MedicamentoService {
	

	@Autowired
	private MedicamentoRepository medicamentoRepository;


	public Collection<Medicamento> buscarTodos(){
		return this.medicamentoRepository.findAll();
	}

	public Optional<Medicamento> buscarPorId(Long id){
		return this.medicamentoRepository.findById(id);
	}

	public Medicamento salvar(Medicamento medicamento){
		return this.medicamentoRepository.save(medicamento);

	}

	public void delete(Long id){


		Optional<Medicamento> medicamento = this.medicamentoRepository.findById(id);
		medicamento.ifPresent(value -> this.medicamentoRepository.delete(value));
	}
}
