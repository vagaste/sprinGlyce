package co.simplon.glycelife.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.simplon.glycelife.app.model.Aliment;

@Repository
public interface AlimentRepo extends JpaRepository<Aliment, Long> {

	public List<Aliment> findByName(@Param("nameToFind") String name);

	public List<Aliment> findByCategoryId(@Param("categoryIdToFind") Long id);

	public List<Aliment> findByEnergyBetween(@Param("energyMinToFind") int energyMin,
			@Param("energyMaxToFind") int energyMax);

	public List<Aliment> findByIgBetween(@Param("igMinToFind") int igMin, @Param("igMaxToFind") int igMax);
}
