package br.senai.bitatom.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


import br.senai.bitatom.service.TerapiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.senai.bitatom.models.Terapia;
import br.senai.bitatom.repository.TerapiaRepository;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/terapia")
public class TerapiaController {

	@Autowired
	private TerapiaService terapiaService;

	@GetMapping
	public ResponseEntity<Collection<Terapia>> buscarTodos() {
		Collection<Terapia> terapias = this.terapiaService.buscarTodos();

		return new ResponseEntity<Collection<Terapia>>(terapias, HttpStatus.OK);

	}


	@GetMapping(value = "/{id}")
	public ResponseEntity<Terapia> buscaPorId(@PathVariable(value = "id") long id) {
		Optional<Terapia> terapia = this.terapiaService.buscarPorId(id);
		return terapia.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).
				orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping(value = "")
	public ResponseEntity<Terapia> salvar(@RequestBody Terapia terapia) {
		terapia = this.terapiaService.salvar(terapia);
		return new ResponseEntity<Terapia>(terapia, HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Terapia> editar(@PathVariable(value = "id") long id, @RequestBody Terapia terapia) {

		this.terapiaService.salvar(terapia);

		return new ResponseEntity<Terapia>(terapia, HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> deletar(@PathVariable(value = "id") long id) {

		this.terapiaService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	
}
