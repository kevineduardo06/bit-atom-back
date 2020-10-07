package br.senai.bitatom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.bitatom.models.Medicamento;
import br.senai.bitatom.repository.MedicamentoRepository;



@RestController
@RequestMapping(value = "/api")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoRepository medicamentoRepository;
	
	@GetMapping(path = "/medicamento")
	public List<Medicamento> buscarMedicamentoPorId() {
		return medicamentoRepository.findAll();
	}
	

}
