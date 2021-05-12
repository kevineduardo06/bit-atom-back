package br.senai.bitatom.service;


import br.senai.bitatom.models.Receita;
import br.senai.bitatom.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;


    public Collection<Receita> buscarTodos(){
        return this.receitaRepository.findAll();
    }

    public Optional<Receita> buscarPorId(Long id){
        return this.receitaRepository.findById(id);
    }

    public Receita salvar(Receita receita){
        return this.receitaRepository.save(receita);

    }

    public List<Receita> buscarReceitasTerapia(Long id){
        return this.receitaRepository.buscarReceitasTerapia(id);
    }

    public void delete(Long id){

        Optional<Receita> Receita = this.receitaRepository.findById(id);
        Receita.ifPresent(value -> this.receitaRepository.delete(value));
    }
}
