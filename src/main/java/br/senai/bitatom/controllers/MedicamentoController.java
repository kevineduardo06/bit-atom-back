package br.senai.bitatom.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<Medicamento> buscarMedicamento() {
		return medicamentoRepository.findAll();
	}
	
	@GetMapping(path = "/medicamento/id/{id}")
	public Optional<Medicamento> buscarMedicamentoPorId( @PathVariable(name = "id", required = true) Long id) {
		return medicamentoRepository.findById(id);
	}

	
	@PostMapping(path = "/medicamento/save")
	public void salvarMedicamento(@RequestBody Medicamento medicamento) {
		medicamentoRepository.save(medicamento);
	}
	
	
	@DeleteMapping(path = "/medicamento/delete/id/{id}")
	public void deleteMedicamento(@PathVariable(name = "id", required = true) Long id) {
		medicamentoRepository.deleteById(id);
	}
	
	
}
