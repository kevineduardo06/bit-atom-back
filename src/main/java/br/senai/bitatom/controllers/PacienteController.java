package br.senai.bitatom.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


import br.senai.bitatom.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.senai.bitatom.models.Paciente;



@CrossOrigin
@RestController
@RequestMapping(value = "/api/paciente")
public class PacienteController {

	@Autowired
	private PacienteService pacienteService;

	@GetMapping
	public ResponseEntity<Collection<Paciente>> buscarTodos() {
		Collection<Paciente> pacientes = this.pacienteService.buscarTodos();

		return new ResponseEntity<Collection<Paciente>>(pacientes, HttpStatus.OK);

	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<Paciente> buscaPorId(@PathVariable(value = "id") long id) {
		Optional<Paciente> paciente = this.pacienteService.buscarPorId(id);
		return paciente.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).
				orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping
	public ResponseEntity<Paciente> salvar(@RequestBody Paciente paciente) {
		paciente = this.pacienteService.salvar(paciente);
		return new ResponseEntity<Paciente>(paciente, HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Paciente> editar(@PathVariable(value = "id") long id, @RequestBody Paciente paciente) {

		this.pacienteService.salvar(paciente);

		return new ResponseEntity<Paciente>(paciente, HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> deletar(@PathVariable(value = "id") long id) {

		this.pacienteService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
