package br.senai.bitatom.controllers;


import br.senai.bitatom.models.Receita;
import br.senai.bitatom.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/receita")
public class ReceitaController {

    @Autowired
    private ReceitaService receitaService;

    @GetMapping
    public ResponseEntity<Collection<Receita>> buscarTodos() {
        Collection<Receita> receita = this.receitaService.buscarTodos();

        return new ResponseEntity<Collection<Receita>>(receita, HttpStatus.OK);

    }

    @GetMapping(value = "/home")
    public List<Receita> buscarReceitas() {
      return this.receitaService.buscarReceitas();

    }

    @GetMapping(value = "/receitas/{id}")
    public List<Receita> buscarReceitasTerapia(@PathVariable(value = "id") long id){
        return this.receitaService.buscarReceitasTerapia(id);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Receita> buscaPorId(@PathVariable(value = "id") long id) {
        Optional<Receita> receita = this.receitaService.buscarPorId(id);
        return receita.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).
                orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(value = "")
    public ResponseEntity<Receita> salvar(@RequestBody Receita receita) {
        receita = this.receitaService.salvar(receita);
        return new ResponseEntity<Receita>(receita, HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Receita> editar(@PathVariable(value = "id") long id, @RequestBody Receita receita) {

        this.receitaService.salvar(receita);

        return new ResponseEntity<Receita>(receita, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> deletar(@PathVariable(value = "id") long id) {

        this.receitaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
