package br.senai.bitatom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.bitatom.models.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
