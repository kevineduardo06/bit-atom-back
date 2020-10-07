package br.senai.bitatom.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.senai.bitatom.models.Medicamento;
import br.senai.bitatom.repository.MedicamentoRepository;



@RestController
public class MedicamentoController {
	
	@Autowired
	private MedicamentoRepository medicamentoRepository;
	
	@GetMapping(path = "api/medicamento-id/{}")
	public ResponseEntity<Optional<Medicamento>> buscarMedicamentoPorId(@PathVariable(name = "id", required = true) Long idMedicamento ) {
		return ResponseEntity.ok(medicamentoRepository.findById(idMedicamento));
	}
	

}
