package br.com.acordovaziobackend.repository;

import br.com.acordovaziobackend.model.Player;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{
    @Query("SELECT p from Player p " +
            "WHERE LOWER(p.nome) LIKE CONCAT('%',LOWER(:nome) ,'%') " +
            "AND (LOWER(p.classeOne) LIKE CONCAT('%',LOWER(:classe) ,'%') " +
            "OR LOWER(p.classeTwo) LIKE CONCAT('%',LOWER(:classe) ,'%'))"
    )
    List<Player> findAllFilters(
            @Param("nome") String nome,
            @Param("classe") String classe,
            Sort sort
    );
}
