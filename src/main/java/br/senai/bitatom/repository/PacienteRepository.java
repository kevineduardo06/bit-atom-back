package br.senai.bitatom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.bitatom.models.Paciente;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    public Optional<Paciente> findByEmailAndSenha(String email, String senha);

}
