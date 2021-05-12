package br.senai.bitatom.repository;

import br.senai.bitatom.models.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long> {

    @Query("select new Receita(rec.medicamento, rec.dose, rec.intervalo) from TerapiaReceita tr inner join tr.receita rec" +
            " left join tr.terapia tera where tera.Id = :id")
    List<Receita> buscarReceitasTerapia(@Param("id") Long id);

}
