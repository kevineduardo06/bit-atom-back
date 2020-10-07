package br.senai.bitatom.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.senai.bitatom.models.Terapia;
import br.senai.bitatom.repository.TerapiaRepository;

@RestController
public class TerapiaController {

	@Autowired
	private TerapiaRepository terapiaRepository;
	
	@GetMapping(path = "api/terapia-id/{}")
	public ResponseEntity<Optional<Terapia>> buscarTerapiaPorId(@PathVariable(name = "id", required = true) Long idTerapia ) {
		return ResponseEntity.ok(terapiaRepository.findById(idTerapia));
	}
	
	
}
