package br.senai.bitatom.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.senai.bitatom.models.Paciente;
import br.senai.bitatom.repository.PacienteRepository;



@RestController
public class PacienteController {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@GetMapping(path = "api/paciente-id/{}")
	public ResponseEntity<Optional<Paciente>> buscarPacientePorId(@PathVariable(name = "id", required = true) Long idPaciente ) {
		return ResponseEntity.ok(pacienteRepository.findById(idPaciente));
	}
	
}
