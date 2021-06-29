package br.senai.bitatom.repository;

import br.senai.bitatom.models.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long> {

    @Query(value = "SELECT * FROM TERAPIA_RECEITA TR \n" +
            "INNER JOIN TERAPIA TER ON TER.ID=TR.TERAPIA_ID\n" +
            "INNER JOIN RECEITA REC ON REC.ID=TR.RECEITA_ID\n" +
            "WHERE REC.ID= :id AND " +
            "TER.INICIO_TERAPIA <= CURRENT_DATE AND TER.FIM_TERAPIA >= CURRENT_DATE", nativeQuery = true)
    List<Receita> buscarReceitasTerapia(@Param("id") Long id);

    @Query(value = "SELECT * FROM RECEITA REC"+
           " INNER JOIN TERAPIA_RECEITA TR ON REC.ID=TR.RECEITA_ID " +
            " INNER JOIN TERAPIA TER ON TER.ID=TR.TERAPIA_ID " +
           " WHERE TER.INICIO_TERAPIA <= CURRENT_DATE AND TER.FIM_TERAPIA >= CURRENT_DATE", nativeQuery = true)
        List<Receita> buscarReceitas();




}
