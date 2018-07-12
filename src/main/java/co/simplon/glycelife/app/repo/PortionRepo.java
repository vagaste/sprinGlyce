package co.simplon.glycelife.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.glycelife.app.model.Portion;

@Repository
public interface PortionRepo extends JpaRepository<Portion, Long> {

}
