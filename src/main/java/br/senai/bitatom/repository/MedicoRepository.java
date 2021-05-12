package br.senai.bitatom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.bitatom.models.Medico;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;


import java.util.List;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
