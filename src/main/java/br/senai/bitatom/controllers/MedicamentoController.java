package br.senai.bitatom.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import br.senai.bitatom.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.senai.bitatom.models.Medicamento;


@CrossOrigin
@RestController
@RequestMapping(value = "/api/medicamento")
public class MedicamentoController {
	@Autowired
	private MedicamentoService medicamentoService;

	@GetMapping
	public ResponseEntity<Collection<Medicamento>> buscarTodos() {
		Collection<Medicamento> medicamentos = this.medicamentoService.buscarTodos();

		return new ResponseEntity<Collection<Medicamento>>(medicamentos, HttpStatus.OK);

	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<Medicamento> buscaPorId(@PathVariable(value = "id") long id) {
		Optional<Medicamento> medicamento = this.medicamentoService.buscarPorId(id);
		return medicamento.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).
				orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping(value = "")
	public ResponseEntity<Medicamento> salvar(@RequestBody Medicamento medicamento) {
		medicamento = this.medicamentoService.salvar(medicamento);
		return new ResponseEntity<Medicamento>(medicamento, HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Medicamento> editar(@PathVariable(value = "id") long id, @RequestBody Medicamento medicamento) {

		this.medicamentoService.salvar(medicamento);

		return new ResponseEntity<Medicamento>(medicamento, HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> deletar(@PathVariable(value = "id") long id) {

		this.medicamentoService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}

	
	

