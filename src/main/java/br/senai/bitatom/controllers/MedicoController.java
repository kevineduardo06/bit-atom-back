package br.senai.bitatom.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import br.senai.bitatom.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.senai.bitatom.models.Medico;
import br.senai.bitatom.repository.MedicoRepository;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public ResponseEntity<Collection<Medico>> buscarTodos() {
        Collection<Medico> medicos = this.medicoService.buscarTodos();

        return new ResponseEntity<Collection<Medico>>(medicos, HttpStatus.OK);

    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Medico> buscaPorId(@PathVariable(value = "id") long id) {
        Optional<Medico> medico = this.medicoService.buscarPorId(id);
        return medico.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).
                orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(value = "")
    public ResponseEntity<Medico> salvar(@RequestBody Medico medico) {
        medico = this.medicoService.salvar(medico);
        return new ResponseEntity<Medico>(medico, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Medico> editar(@PathVariable(value = "id") long id, @RequestBody Medico medico) {

        this.medicoService.salvar(medico);

        return new ResponseEntity<Medico>(medico, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")

    public ResponseEntity<Object> deletar(@PathVariable(value = "id") long id) {

        this.medicoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    }
