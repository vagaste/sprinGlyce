package co.simplon.glycelife.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.glycelife.app.model.Recette;

@Repository
public interface RecetteRepo extends JpaRepository<Recette, Long> {

	
}
