package br.senai.bitatom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.bitatom.models.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long>{

}
