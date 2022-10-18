package br.com.acordovaziobackend.repository;

import br.com.acordovaziobackend.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>{
}
