package br.senai.bitatom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.bitatom.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
