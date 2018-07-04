package co.simplon.glycelife.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import co.simplon.glycelife.model.Aliment;

public interface AlimentRepo extends JpaRepository<Aliment, Long> {

	public List<Aliment> findByName(@Param("nameToFind") String name);

	public List<Aliment> findByCategoryId(@Param("categoryIdToFind") Long id);

	public List<Aliment> findByEnergy(@Param("energyMinToFind") int energyMin, @Param("energyMaxToFind") int energyMax);

	public List<Aliment> findByIg(@Param("igMinToFind") int igMin, @Param("igMaxToFind") int igMax);
}
