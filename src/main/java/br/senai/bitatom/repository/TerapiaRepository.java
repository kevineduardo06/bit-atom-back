package br.senai.bitatom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.bitatom.models.Terapia;
import org.springframework.stereotype.Repository;


@Repository
public interface TerapiaRepository extends JpaRepository<Terapia, Long>{


}
