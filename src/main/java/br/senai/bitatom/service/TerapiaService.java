package br.senai.bitatom.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.senai.bitatom.models.Terapia;
import br.senai.bitatom.repository.TerapiaRepository;

public class TerapiaService {

	@Autowired
	private TerapiaRepository terapiaRepository;
	
	public void cadastroTerapia(Terapia terapia) {
		terapiaRepository.saveAndFlush(terapia);
	}
	
}
