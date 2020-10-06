package br.senai.bitatom.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.senai.bitatom.models.Medicamento;
import br.senai.bitatom.repository.MedicamentoRepository;

public class MedicamentoService {
	
	@Autowired
	private MedicamentoRepository medicamentoRepository;
	
	public void cadastroMedicamento(Medicamento medicamento) {
		medicamentoRepository.saveAndFlush(medicamento);
	}

}
