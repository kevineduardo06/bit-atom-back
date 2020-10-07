package br.senai.bitatom.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.senai.bitatom.models.Medico;
import br.senai.bitatom.repository.MedicoRepository;

@RestController
public class MedicoController {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@GetMapping(path = "api/medico-id/{}")
	public ResponseEntity<Optional<Medico>> buscarMedicoPorId(@PathVariable(name = "id", required = true) Long idMedico ) {
		return ResponseEntity.ok(medicoRepository.findById(idMedico));
	}

}
